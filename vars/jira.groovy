def call(Map stageParams) {
 
testIssue = [fields: [ project: [id: '10000'],
                           summary: 'New JIRA Created from Jenkins.',
                           description: 'New JIRA Created from Jenkins.',
                           issuetype: [name: 'Task' ]]]

response = jiraNewIssue issue: testIssue, site: 'LOCAL'

echo response.successful.toString()
echo response.data.toString()
  }
