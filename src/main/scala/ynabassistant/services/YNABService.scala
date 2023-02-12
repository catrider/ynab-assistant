package ynabassistant.services

import ynabassistant.http.HttpClient
import ynabassistant.models.Category

class YNABService(httpClient: HttpClient) {

  def getFundsReadyForAssignment(): Long = {
    httpClient.get("").toLong
  }

}
