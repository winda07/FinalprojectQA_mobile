<?xml version="1.0" encoding="UTF-8"?>
<TestSuiteEntity>
   <description></description>
   <name>Transaction</name>
   <tag></tag>
   <isRerun>false</isRerun>
   <mailRecipient></mailRecipient>
   <numberOfRerun>3</numberOfRerun>
   <pageLoadTimeout>30</pageLoadTimeout>
   <pageLoadTimeoutDefault>true</pageLoadTimeoutDefault>
   <rerunFailedTestCasesOnly>false</rerunFailedTestCasesOnly>
   <rerunImmediately>true</rerunImmediately>
   <testSuiteGuid>c27370ca-0d14-44b2-a597-9dd31d6ea909</testSuiteGuid>
   <testCaseLink>
      <guid>40004732-a705-4024-af3f-7e65cc89c489</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/Transaction/Add account transaction</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>d39c71c4-da78-43a6-9a95-8d492acfab93</id>
         <iterationEntity>
            <iterationType>ALL</iterationType>
            <value></value>
         </iterationEntity>
         <testDataId>Data Files/Add account</testDataId>
      </testDataLink>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
      <variableLink>
         <testDataLinkId>d39c71c4-da78-43a6-9a95-8d492acfab93</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>accountname</value>
         <variableId>0e28febc-10f5-4589-b3ee-0437266a3aac</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>d39c71c4-da78-43a6-9a95-8d492acfab93</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>initbalance</value>
         <variableId>a889ee37-56aa-4196-b9d1-fd64e0c6d6c1</variableId>
      </variableLink>
   </testCaseLink>
   <testCaseLink>
      <guid>a779b669-8861-4404-aaf9-7f2e3094d43b</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/Transaction/Add payee</testCaseId>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
   </testCaseLink>
   <testCaseLink>
      <guid>67f08ea3-10ec-468e-bda3-cbe1745e1377</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/Transaction/Make a payment</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>97ec84d0-6ae8-4668-8a71-3cdd7bbff6af</id>
         <iterationEntity>
            <iterationType>ALL</iterationType>
            <value></value>
         </iterationEntity>
         <testDataId>Data Files/payment paye</testDataId>
      </testDataLink>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
      <variableLink>
         <testDataLinkId>97ec84d0-6ae8-4668-8a71-3cdd7bbff6af</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>amount</value>
         <variableId>6b7ffbb1-cd2b-4fef-84ca-22c77f9162bc</variableId>
      </variableLink>
   </testCaseLink>
   <testCaseLink>
      <guid>e6ba446a-0302-4716-8ffc-5b58ca0b8ab0</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/Transaction/Make a transfer</testCaseId>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
   </testCaseLink>
</TestSuiteEntity>
