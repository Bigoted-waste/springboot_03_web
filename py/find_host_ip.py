import requests
import json

# zabbix地址
url = 'http://zjkxtp.natappfree.cc/api_jsonrpc.php'
post_headers = {'Content-Type': 'application/json'}


# 获取token
def login():
    post_data = {
        "jsonrpc": "2.0",
        "method": "user.login",
        "params": {
            "user": "Admin",
            "password": "zabbix"
        },
        "id": 1
    }
    ret = requests.post(url, data=json.dumps(post_data), headers=post_headers)
    e = json.loads(ret.text)
    # print(e['result'])
    return e['result']


# 获取主机信息
def get_hosts(token_num):
    post_data = {
        "jsonrpc": "2.0",
        "method": "host.get",
        "params": {
            "output": [
                "hostid",
                "host"
            ],
            "selectInterfaces": [
                "interfaceid",
                "ip",
                "port"
            ]
        },
        "id": 1,
        "auth": token_num,
    }
    ret = requests.post(url, data=json.dumps(post_data), headers=post_headers)
    e = json.loads(ret.content)
    # print(e)
    return e['result']


# 拿到IP地址
def get_proc(data):
    dict = {}
    list = data
    for i in list:
        host = i['host']
        inter = i['interfaces']
        for j in inter:
            ip = j['ip']
            dict[host] = ip
    print(dict)
    return dict


if __name__ == '__main__':
    (get_proc(get_hosts(login())))
