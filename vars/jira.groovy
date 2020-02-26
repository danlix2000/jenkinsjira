    def testIssue = [fields: [ // id or key must present for project.
                               project: [id: '10000'],
                               summary: 'New JIRA Created from Jenkins.',
                               description: 'New JIRA Created from Jenkins.',
                                // id or name must present for issueType.
                               issuetype: [name: 'Task' ]]]

    response = jiraNewIssue issue: testIssue, site: 'jiradd'

    echo response.successful.toString()
    echo response.data.toString()
