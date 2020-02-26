def call(Map stageParams) {
 
testIssue = [fields: [ project: [id: '10000'],
                           summary: 'New JIRA Created from Jenkins.',
                           description: 'New JIRA Created from Jenkins.',
                           issuetype: [name: 'Task' ]]]


echo response.successful.toString()
echo response.data.toString()
  }
