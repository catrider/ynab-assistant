package ynabassistant.http

import requests.RequestAuth.Bearer

class HttpClient(token: String) {

  def get(url: String): String = {
    requests.get(url, auth = Bearer(token)).text()
  }

}
