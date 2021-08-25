from pyzabbix import ZabbixAPI


def login():
    zapi = ZabbixAPI('http://10.10.67.128:8080/api_jsonrpc.php')
    zapi.login('Admin', 'zabbix')
    return zapi


def find_all_hosts(host):
    hosts = host.host.get(
        output="extend",
    )
    if len(hosts) != 0:
        return hosts
    else:
        return None


if __name__ == '__main__':
    print(find_all_hosts(login()))
