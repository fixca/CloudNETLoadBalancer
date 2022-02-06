# CloudNETLoadBalancer

An External plugin for CloudNET V3<br>
CloudNET V3에 대응하는 외부 플러그인입니다.

---

# English - coming soon...

---

# Korean 
## 뭐하는 친구에요?
이 친구는 CloudNET V3로 서버를 여는 분들을 위한 플러그인이에요!

## 그래서 정확히 뭘 하는 놈이에요?
일단 먼저 CloudNET V3라는 시스템에 대하여 알 필요가 있어요!<br>
[CloudNET V3가 뭐에요??](https://www.spigotmc.org/resources/cloudnet-v3-the-cloud-network-environment-technology.42059/)

그래서 이 친구가 하는 일이 뭐냐면,
Bukkit에 넣어서 작동되는 Bukkit plugin 인데요.
CloudNET의 API를 이용하여 플러그인이 적용되어있는 서버의 최대 인원수를 탐지하고,
플레이어가 서버에 접속할 때 마다 총 인원수를 체크해요!
* 만약에 서버의 최대 인원수랑 총 인원수가 같아졌다면?
  - *해당 서버에 더이상 접속을 서버의 접속 가능 인원이 다시 생길때 까지 차단하고, 새로운 서버를 복제해줘요!*
  - 즉, 현재 서버가 Lobby-1 이라는 서버가 있고, 서버의 인원이 다 찼을 경우에 Lobby-2 라는 새로운 서버를 복제하는거에요!
  - 그리고 Lobby-2 서버에 플레이어가 들어오게끔 만들어줘요!

## 서버 복제가 안돼잖아요!
서버 복제는 서버 task의 smartconfig를 설정해주셔야 해요!
smartconfig를 다음과 같이 설정해주세요!
```json
"properties": {
    "smartConfig": {
      "enabled": true,
      "priority": 10,
      "directTemplatesAndInclusionsSetup": false,
      "preparedServices": 1,
      "dynamicMemoryAllocation": false,
      "dynamicMemoryAllocationRange": 256,
      "percentOfPlayersToCheckShouldAutoStopTheServiceInFuture": 0,
      "autoStopTimeByUnusedServiceInSeconds": 180,
      "percentOfPlayersForANewServiceByInstance": 100,
      "forAnewInstanceDelayTimeInSeconds": -1,
      "minNonFullServices": 1,
      "templateInstaller": "INSTALL_ALL",
      "maxServiceCount": -1
    }
  }
```
