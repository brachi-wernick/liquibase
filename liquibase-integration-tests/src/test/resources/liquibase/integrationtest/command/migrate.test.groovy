package liquibase.integrationtest.command

CommandTest.define {
    command = ["migrate"]
    signature = """
Short Description: MISSING
Long Description: MISSING
Required Args:
  changeLogFile (String) MISSING DESCRIPTION
  url (String) MISSING DESCRIPTION
Optional Args:
  contexts (String) MISSING DESCRIPTION
    Default: null
  labels (String) MISSING DESCRIPTION
    Default: null
"""

    run {
        arguments = [
                changeLogFile: "changelogs/hsqldb/complete/simple.changelog.xml",
        ]

        expectedResults = [
                statusMessage: "Successfully executed migrate",
                statusCode   : 0
        ]
    }
}
