# feature flag 

[これ](https://www.baeldung.com/spring-feature-flags)を見て試したくなった

## 内容

application.yml の`features.experimental`の値より`/experimental/tasks`エンドポイントの動作が変わります。
`true`の場合は`200`を返して、`false`の場合は`404`になります

application.yml に`features.experimental`が定義されてない場合は`false`の場合と同じ動きになります（`404` を返す）

これで意図的に application.yml の設定を変えない限り実験中の API にアクセスすることができなくなります

## テスト

検討中。。。

