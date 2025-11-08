/*
 * Copyright (c) 2012 - 2025 Data In Motion and others.
 * All rights reserved. 
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *      Mark Hoffmann - initial API and implementation
 */
package org.cyclonedx.schema.bom;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>External Reference Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.cyclonedx.schema.bom.BOMPackage#getExternalReferenceType()
 * @model extendedMetaData="name='externalReferenceType'"
 * @generated
 */
@ProviderType
public enum ExternalReferenceType implements Enumerator {
	/**
	 * The '<em><b>Vcs</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Version Control System
	 * <!-- end-model-doc -->
	 * @see #VCS_VALUE
	 * @generated
	 * @ordered
	 */
	VCS(0, "vcs", "vcs"),

	/**
	 * The '<em><b>Issue Tracker</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Issue or defect tracking system, or an Application Lifecycle Management (ALM) system
	 * <!-- end-model-doc -->
	 * @see #ISSUE_TRACKER_VALUE
	 * @generated
	 * @ordered
	 */
	ISSUE_TRACKER(1, "issueTracker", "issue-tracker"),

	/**
	 * The '<em><b>Website</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Website
	 * <!-- end-model-doc -->
	 * @see #WEBSITE_VALUE
	 * @generated
	 * @ordered
	 */
	WEBSITE(2, "website", "website"),

	/**
	 * The '<em><b>Advisories</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Security advisories
	 * <!-- end-model-doc -->
	 * @see #ADVISORIES_VALUE
	 * @generated
	 * @ordered
	 */
	ADVISORIES(3, "advisories", "advisories"),

	/**
	 * The '<em><b>Bom</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bill-of-materials (SBOM, OBOM, HBOM, SaaSBOM, etc)
	 * <!-- end-model-doc -->
	 * @see #BOM_VALUE
	 * @generated
	 * @ordered
	 */
	BOM(4, "bom", "bom"),

	/**
	 * The '<em><b>Mailing List</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Mailing list or discussion group
	 * <!-- end-model-doc -->
	 * @see #MAILING_LIST_VALUE
	 * @generated
	 * @ordered
	 */
	MAILING_LIST(5, "mailingList", "mailing-list"),

	/**
	 * The '<em><b>Social</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Social media account
	 * <!-- end-model-doc -->
	 * @see #SOCIAL_VALUE
	 * @generated
	 * @ordered
	 */
	SOCIAL(6, "social", "social"),

	/**
	 * The '<em><b>Chat</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Real-time chat platform
	 * <!-- end-model-doc -->
	 * @see #CHAT_VALUE
	 * @generated
	 * @ordered
	 */
	CHAT(7, "chat", "chat"),

	/**
	 * The '<em><b>Documentation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Documentation, guides, or how-to instructions
	 * <!-- end-model-doc -->
	 * @see #DOCUMENTATION_VALUE
	 * @generated
	 * @ordered
	 */
	DOCUMENTATION(8, "documentation", "documentation"),

	/**
	 * The '<em><b>Support</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Community or commercial support
	 * <!-- end-model-doc -->
	 * @see #SUPPORT_VALUE
	 * @generated
	 * @ordered
	 */
	SUPPORT(9, "support", "support"),

	/**
	 * The '<em><b>Source Distribution</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The location where the source code distributable can be obtained. This is often an archive format such as zip or tgz. The source-distribution type complements use of the version control (vcs) type.
	 * <!-- end-model-doc -->
	 * @see #SOURCE_DISTRIBUTION_VALUE
	 * @generated
	 * @ordered
	 */
	SOURCE_DISTRIBUTION(10, "sourceDistribution", "source-distribution"),

	/**
	 * The '<em><b>Distribution</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Direct or repository download location
	 * <!-- end-model-doc -->
	 * @see #DISTRIBUTION_VALUE
	 * @generated
	 * @ordered
	 */
	DISTRIBUTION(11, "distribution", "distribution"),

	/**
	 * The '<em><b>Distribution Intake</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The location where a component was published to. This is often the same as "distribution" but may also include specialized publishing processes that act as an intermediary
	 * <!-- end-model-doc -->
	 * @see #DISTRIBUTION_INTAKE_VALUE
	 * @generated
	 * @ordered
	 */
	DISTRIBUTION_INTAKE(12, "distributionIntake", "distribution-intake"),

	/**
	 * The '<em><b>License</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         The URL to the license file. If a license URL has been defined in the license
	 *                         node, it should also be defined as an external reference for completeness.
	 *                         Example: https://www.apache.org/licenses/LICENSE-2.0.txt
	 *                     
	 * <!-- end-model-doc -->
	 * @see #LICENSE_VALUE
	 * @generated
	 * @ordered
	 */
	LICENSE(13, "license", "license"),

	/**
	 * The '<em><b>Build Meta</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Build-system specific meta file (i.e. pom.xml, package.json, .nuspec, etc)
	 * <!-- end-model-doc -->
	 * @see #BUILD_META_VALUE
	 * @generated
	 * @ordered
	 */
	BUILD_META(14, "buildMeta", "build-meta"),

	/**
	 * The '<em><b>Build System</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * URL to an automated build system
	 * <!-- end-model-doc -->
	 * @see #BUILD_SYSTEM_VALUE
	 * @generated
	 * @ordered
	 */
	BUILD_SYSTEM(15, "buildSystem", "build-system"),

	/**
	 * The '<em><b>Release Notes</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * URL to release notes
	 * <!-- end-model-doc -->
	 * @see #RELEASE_NOTES_VALUE
	 * @generated
	 * @ordered
	 */
	RELEASE_NOTES(16, "releaseNotes", "release-notes"),

	/**
	 * The '<em><b>Security Contact</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies a way to contact the maintainer, supplier, or provider in the event of a security incident. Common URIs include links to a disclosure procedure, a mailto (RFC-2368) that specifies an email address, a tel (RFC-3966) that specifies a phone number, or dns (RFC-4501) that specifies the records containing DNS Security TXT.
	 * <!-- end-model-doc -->
	 * @see #SECURITY_CONTACT_VALUE
	 * @generated
	 * @ordered
	 */
	SECURITY_CONTACT(17, "securityContact", "security-contact"),

	/**
	 * The '<em><b>Model Card</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A model card describes the intended uses of a machine learning model, potential
	 *                         limitations, biases, ethical considerations, training parameters, datasets used to train the
	 *                         model, performance metrics, and other relevant data useful for ML transparency.
	 * <!-- end-model-doc -->
	 * @see #MODEL_CARD_VALUE
	 * @generated
	 * @ordered
	 */
	MODEL_CARD(18, "modelCard", "model-card"),

	/**
	 * The '<em><b>Log</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A record of events that occurred in a computer system or application, such as problems, errors, or information on current operations.
	 * <!-- end-model-doc -->
	 * @see #LOG_VALUE
	 * @generated
	 * @ordered
	 */
	LOG(19, "log", "log"),

	/**
	 * The '<em><b>Configuration</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Parameters or settings that may be used by other components or services.
	 * <!-- end-model-doc -->
	 * @see #CONFIGURATION_VALUE
	 * @generated
	 * @ordered
	 */
	CONFIGURATION(20, "configuration", "configuration"),

	/**
	 * The '<em><b>Evidence</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Information used to substantiate a claim.
	 * <!-- end-model-doc -->
	 * @see #EVIDENCE_VALUE
	 * @generated
	 * @ordered
	 */
	EVIDENCE(21, "evidence", "evidence"),

	/**
	 * The '<em><b>Formulation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Describes how a component or service was manufactured or deployed.
	 * <!-- end-model-doc -->
	 * @see #FORMULATION_VALUE
	 * @generated
	 * @ordered
	 */
	FORMULATION(22, "formulation", "formulation"),

	/**
	 * The '<em><b>Attestation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Human or machine-readable statements containing facts, evidence, or testimony
	 * <!-- end-model-doc -->
	 * @see #ATTESTATION_VALUE
	 * @generated
	 * @ordered
	 */
	ATTESTATION(23, "attestation", "attestation"),

	/**
	 * The '<em><b>Threat Model</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An enumeration of identified weaknesses, threats, and countermeasures, dataflow diagram (DFD), attack tree, and other supporting documentation in human-readable or machine-readable format
	 * <!-- end-model-doc -->
	 * @see #THREAT_MODEL_VALUE
	 * @generated
	 * @ordered
	 */
	THREAT_MODEL(24, "threatModel", "threat-model"),

	/**
	 * The '<em><b>Adversary Model</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The defined assumptions, goals, and capabilities of an adversary.
	 * <!-- end-model-doc -->
	 * @see #ADVERSARY_MODEL_VALUE
	 * @generated
	 * @ordered
	 */
	ADVERSARY_MODEL(25, "adversaryModel", "adversary-model"),

	/**
	 * The '<em><b>Risk Assessment</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies and analyzes the potential of future events that may negatively impact individuals, assets, and/or the environment. Risk assessments may also include judgments on the tolerability of each risk.
	 * <!-- end-model-doc -->
	 * @see #RISK_ASSESSMENT_VALUE
	 * @generated
	 * @ordered
	 */
	RISK_ASSESSMENT(26, "riskAssessment", "risk-assessment"),

	/**
	 * The '<em><b>Vulnerability Assertion</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A Vulnerability Disclosure Report (VDR) which asserts the known and previously unknown vulnerabilities that affect a component, service, or product including the analysis and findings describing the impact (or lack of impact) that the reported vulnerability has on a component, service, or product.
	 * <!-- end-model-doc -->
	 * @see #VULNERABILITY_ASSERTION_VALUE
	 * @generated
	 * @ordered
	 */
	VULNERABILITY_ASSERTION(27, "vulnerabilityAssertion", "vulnerability-assertion"),

	/**
	 * The '<em><b>Exploitability Statement</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A Vulnerability Exploitability eXchange (VEX) which asserts the known vulnerabilities that do not affect a product, product family, or organization, and optionally the ones that do. The VEX should include the analysis and findings describing the impact (or lack of impact) that the reported vulnerability has on the product, product family, or organization.
	 * <!-- end-model-doc -->
	 * @see #EXPLOITABILITY_STATEMENT_VALUE
	 * @generated
	 * @ordered
	 */
	EXPLOITABILITY_STATEMENT(28, "exploitabilityStatement", "exploitability-statement"),

	/**
	 * The '<em><b>Pentest Report</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Results from an authorized simulated cyberattack on a component or service, otherwise known as a penetration test
	 * <!-- end-model-doc -->
	 * @see #PENTEST_REPORT_VALUE
	 * @generated
	 * @ordered
	 */
	PENTEST_REPORT(29, "pentestReport", "pentest-report"),

	/**
	 * The '<em><b>Static Analysis Report</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * SARIF or proprietary machine or human-readable report for which static analysis has identified code quality, security, and other potential issues with the source code
	 * <!-- end-model-doc -->
	 * @see #STATIC_ANALYSIS_REPORT_VALUE
	 * @generated
	 * @ordered
	 */
	STATIC_ANALYSIS_REPORT(30, "staticAnalysisReport", "static-analysis-report"),

	/**
	 * The '<em><b>Dynamic Analysis Report</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Dynamic analysis report that has identified issues such as vulnerabilities and misconfigurations
	 * <!-- end-model-doc -->
	 * @see #DYNAMIC_ANALYSIS_REPORT_VALUE
	 * @generated
	 * @ordered
	 */
	DYNAMIC_ANALYSIS_REPORT(31, "dynamicAnalysisReport", "dynamic-analysis-report"),

	/**
	 * The '<em><b>Runtime Analysis Report</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Report generated by analyzing the call stack of a running application
	 * <!-- end-model-doc -->
	 * @see #RUNTIME_ANALYSIS_REPORT_VALUE
	 * @generated
	 * @ordered
	 */
	RUNTIME_ANALYSIS_REPORT(32, "runtimeAnalysisReport", "runtime-analysis-report"),

	/**
	 * The '<em><b>Component Analysis Report</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Report generated by Software Composition Analysis (SCA), container analysis, or other forms of component analysis
	 * <!-- end-model-doc -->
	 * @see #COMPONENT_ANALYSIS_REPORT_VALUE
	 * @generated
	 * @ordered
	 */
	COMPONENT_ANALYSIS_REPORT(33, "componentAnalysisReport", "component-analysis-report"),

	/**
	 * The '<em><b>Maturity Report</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Report containing a formal assessment of an organization, business unit, or team against a maturity model
	 * <!-- end-model-doc -->
	 * @see #MATURITY_REPORT_VALUE
	 * @generated
	 * @ordered
	 */
	MATURITY_REPORT(34, "maturityReport", "maturity-report"),

	/**
	 * The '<em><b>Certification Report</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Industry, regulatory, or other certification from an accredited (if applicable) certification body
	 * <!-- end-model-doc -->
	 * @see #CERTIFICATION_REPORT_VALUE
	 * @generated
	 * @ordered
	 */
	CERTIFICATION_REPORT(35, "certificationReport", "certification-report"),

	/**
	 * The '<em><b>Quality Metrics</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Report or system in which quality metrics can be obtained
	 * <!-- end-model-doc -->
	 * @see #QUALITY_METRICS_VALUE
	 * @generated
	 * @ordered
	 */
	QUALITY_METRICS(36, "qualityMetrics", "quality-metrics"),

	/**
	 * The '<em><b>Codified Infrastructure</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Code or configuration that defines and provisions virtualized infrastructure, commonly referred to as Infrastructure as Code (IaC)
	 * <!-- end-model-doc -->
	 * @see #CODIFIED_INFRASTRUCTURE_VALUE
	 * @generated
	 * @ordered
	 */
	CODIFIED_INFRASTRUCTURE(37, "codifiedInfrastructure", "codified-infrastructure"),

	/**
	 * The '<em><b>Poam</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Plans of Action and Milestones (POA&M) complement an "attestation" external reference. POA&M is defined by NIST as a "document that identifies tasks needing to be accomplished. It details resources required to accomplish the elements of the plan, any milestones in meeting the tasks and scheduled completion dates for the milestones".
	 * <!-- end-model-doc -->
	 * @see #POAM_VALUE
	 * @generated
	 * @ordered
	 */
	POAM(38, "poam", "poam"),

	/**
	 * The '<em><b>Electronic Signature</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An e-signature is commonly a scanned representation of a written signature or a stylized script of the persons name.
	 * <!-- end-model-doc -->
	 * @see #ELECTRONIC_SIGNATURE_VALUE
	 * @generated
	 * @ordered
	 */
	ELECTRONIC_SIGNATURE(39, "electronicSignature", "electronic-signature"),

	/**
	 * The '<em><b>Digital Signature</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A signature that leverages cryptography, typically public/private key pairs, which provides strong authenticity verification.
	 * <!-- end-model-doc -->
	 * @see #DIGITAL_SIGNATURE_VALUE
	 * @generated
	 * @ordered
	 */
	DIGITAL_SIGNATURE(40, "digitalSignature", "digital-signature"),

	/**
	 * The '<em><b>Rfc9116</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Document that complies with RFC-9116 (A File Format to Aid in Security Vulnerability Disclosure)
	 * <!-- end-model-doc -->
	 * @see #RFC9116_VALUE
	 * @generated
	 * @ordered
	 */
	RFC9116(41, "rfc9116", "rfc-9116"),

	/**
	 * The '<em><b>Other</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Use this if no other types accurately describe the purpose of the external reference
	 * <!-- end-model-doc -->
	 * @see #OTHER_VALUE
	 * @generated
	 * @ordered
	 */
	OTHER(42, "other", "other");

	/**
	 * The '<em><b>Vcs</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Version Control System
	 * <!-- end-model-doc -->
	 * @see #VCS
	 * @model name="vcs"
	 * @generated
	 * @ordered
	 */
	public static final int VCS_VALUE = 0;

	/**
	 * The '<em><b>Issue Tracker</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Issue or defect tracking system, or an Application Lifecycle Management (ALM) system
	 * <!-- end-model-doc -->
	 * @see #ISSUE_TRACKER
	 * @model name="issueTracker" literal="issue-tracker"
	 * @generated
	 * @ordered
	 */
	public static final int ISSUE_TRACKER_VALUE = 1;

	/**
	 * The '<em><b>Website</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Website
	 * <!-- end-model-doc -->
	 * @see #WEBSITE
	 * @model name="website"
	 * @generated
	 * @ordered
	 */
	public static final int WEBSITE_VALUE = 2;

	/**
	 * The '<em><b>Advisories</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Security advisories
	 * <!-- end-model-doc -->
	 * @see #ADVISORIES
	 * @model name="advisories"
	 * @generated
	 * @ordered
	 */
	public static final int ADVISORIES_VALUE = 3;

	/**
	 * The '<em><b>Bom</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bill-of-materials (SBOM, OBOM, HBOM, SaaSBOM, etc)
	 * <!-- end-model-doc -->
	 * @see #BOM
	 * @model name="bom"
	 * @generated
	 * @ordered
	 */
	public static final int BOM_VALUE = 4;

	/**
	 * The '<em><b>Mailing List</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Mailing list or discussion group
	 * <!-- end-model-doc -->
	 * @see #MAILING_LIST
	 * @model name="mailingList" literal="mailing-list"
	 * @generated
	 * @ordered
	 */
	public static final int MAILING_LIST_VALUE = 5;

	/**
	 * The '<em><b>Social</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Social media account
	 * <!-- end-model-doc -->
	 * @see #SOCIAL
	 * @model name="social"
	 * @generated
	 * @ordered
	 */
	public static final int SOCIAL_VALUE = 6;

	/**
	 * The '<em><b>Chat</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Real-time chat platform
	 * <!-- end-model-doc -->
	 * @see #CHAT
	 * @model name="chat"
	 * @generated
	 * @ordered
	 */
	public static final int CHAT_VALUE = 7;

	/**
	 * The '<em><b>Documentation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Documentation, guides, or how-to instructions
	 * <!-- end-model-doc -->
	 * @see #DOCUMENTATION
	 * @model name="documentation"
	 * @generated
	 * @ordered
	 */
	public static final int DOCUMENTATION_VALUE = 8;

	/**
	 * The '<em><b>Support</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Community or commercial support
	 * <!-- end-model-doc -->
	 * @see #SUPPORT
	 * @model name="support"
	 * @generated
	 * @ordered
	 */
	public static final int SUPPORT_VALUE = 9;

	/**
	 * The '<em><b>Source Distribution</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The location where the source code distributable can be obtained. This is often an archive format such as zip or tgz. The source-distribution type complements use of the version control (vcs) type.
	 * <!-- end-model-doc -->
	 * @see #SOURCE_DISTRIBUTION
	 * @model name="sourceDistribution" literal="source-distribution"
	 * @generated
	 * @ordered
	 */
	public static final int SOURCE_DISTRIBUTION_VALUE = 10;

	/**
	 * The '<em><b>Distribution</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Direct or repository download location
	 * <!-- end-model-doc -->
	 * @see #DISTRIBUTION
	 * @model name="distribution"
	 * @generated
	 * @ordered
	 */
	public static final int DISTRIBUTION_VALUE = 11;

	/**
	 * The '<em><b>Distribution Intake</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The location where a component was published to. This is often the same as "distribution" but may also include specialized publishing processes that act as an intermediary
	 * <!-- end-model-doc -->
	 * @see #DISTRIBUTION_INTAKE
	 * @model name="distributionIntake" literal="distribution-intake"
	 * @generated
	 * @ordered
	 */
	public static final int DISTRIBUTION_INTAKE_VALUE = 12;

	/**
	 * The '<em><b>License</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         The URL to the license file. If a license URL has been defined in the license
	 *                         node, it should also be defined as an external reference for completeness.
	 *                         Example: https://www.apache.org/licenses/LICENSE-2.0.txt
	 *                     
	 * <!-- end-model-doc -->
	 * @see #LICENSE
	 * @model name="license"
	 * @generated
	 * @ordered
	 */
	public static final int LICENSE_VALUE = 13;

	/**
	 * The '<em><b>Build Meta</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Build-system specific meta file (i.e. pom.xml, package.json, .nuspec, etc)
	 * <!-- end-model-doc -->
	 * @see #BUILD_META
	 * @model name="buildMeta" literal="build-meta"
	 * @generated
	 * @ordered
	 */
	public static final int BUILD_META_VALUE = 14;

	/**
	 * The '<em><b>Build System</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * URL to an automated build system
	 * <!-- end-model-doc -->
	 * @see #BUILD_SYSTEM
	 * @model name="buildSystem" literal="build-system"
	 * @generated
	 * @ordered
	 */
	public static final int BUILD_SYSTEM_VALUE = 15;

	/**
	 * The '<em><b>Release Notes</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * URL to release notes
	 * <!-- end-model-doc -->
	 * @see #RELEASE_NOTES
	 * @model name="releaseNotes" literal="release-notes"
	 * @generated
	 * @ordered
	 */
	public static final int RELEASE_NOTES_VALUE = 16;

	/**
	 * The '<em><b>Security Contact</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies a way to contact the maintainer, supplier, or provider in the event of a security incident. Common URIs include links to a disclosure procedure, a mailto (RFC-2368) that specifies an email address, a tel (RFC-3966) that specifies a phone number, or dns (RFC-4501) that specifies the records containing DNS Security TXT.
	 * <!-- end-model-doc -->
	 * @see #SECURITY_CONTACT
	 * @model name="securityContact" literal="security-contact"
	 * @generated
	 * @ordered
	 */
	public static final int SECURITY_CONTACT_VALUE = 17;

	/**
	 * The '<em><b>Model Card</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A model card describes the intended uses of a machine learning model, potential
	 *                         limitations, biases, ethical considerations, training parameters, datasets used to train the
	 *                         model, performance metrics, and other relevant data useful for ML transparency.
	 * <!-- end-model-doc -->
	 * @see #MODEL_CARD
	 * @model name="modelCard" literal="model-card"
	 * @generated
	 * @ordered
	 */
	public static final int MODEL_CARD_VALUE = 18;

	/**
	 * The '<em><b>Log</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A record of events that occurred in a computer system or application, such as problems, errors, or information on current operations.
	 * <!-- end-model-doc -->
	 * @see #LOG
	 * @model name="log"
	 * @generated
	 * @ordered
	 */
	public static final int LOG_VALUE = 19;

	/**
	 * The '<em><b>Configuration</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Parameters or settings that may be used by other components or services.
	 * <!-- end-model-doc -->
	 * @see #CONFIGURATION
	 * @model name="configuration"
	 * @generated
	 * @ordered
	 */
	public static final int CONFIGURATION_VALUE = 20;

	/**
	 * The '<em><b>Evidence</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Information used to substantiate a claim.
	 * <!-- end-model-doc -->
	 * @see #EVIDENCE
	 * @model name="evidence"
	 * @generated
	 * @ordered
	 */
	public static final int EVIDENCE_VALUE = 21;

	/**
	 * The '<em><b>Formulation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Describes how a component or service was manufactured or deployed.
	 * <!-- end-model-doc -->
	 * @see #FORMULATION
	 * @model name="formulation"
	 * @generated
	 * @ordered
	 */
	public static final int FORMULATION_VALUE = 22;

	/**
	 * The '<em><b>Attestation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Human or machine-readable statements containing facts, evidence, or testimony
	 * <!-- end-model-doc -->
	 * @see #ATTESTATION
	 * @model name="attestation"
	 * @generated
	 * @ordered
	 */
	public static final int ATTESTATION_VALUE = 23;

	/**
	 * The '<em><b>Threat Model</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An enumeration of identified weaknesses, threats, and countermeasures, dataflow diagram (DFD), attack tree, and other supporting documentation in human-readable or machine-readable format
	 * <!-- end-model-doc -->
	 * @see #THREAT_MODEL
	 * @model name="threatModel" literal="threat-model"
	 * @generated
	 * @ordered
	 */
	public static final int THREAT_MODEL_VALUE = 24;

	/**
	 * The '<em><b>Adversary Model</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The defined assumptions, goals, and capabilities of an adversary.
	 * <!-- end-model-doc -->
	 * @see #ADVERSARY_MODEL
	 * @model name="adversaryModel" literal="adversary-model"
	 * @generated
	 * @ordered
	 */
	public static final int ADVERSARY_MODEL_VALUE = 25;

	/**
	 * The '<em><b>Risk Assessment</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies and analyzes the potential of future events that may negatively impact individuals, assets, and/or the environment. Risk assessments may also include judgments on the tolerability of each risk.
	 * <!-- end-model-doc -->
	 * @see #RISK_ASSESSMENT
	 * @model name="riskAssessment" literal="risk-assessment"
	 * @generated
	 * @ordered
	 */
	public static final int RISK_ASSESSMENT_VALUE = 26;

	/**
	 * The '<em><b>Vulnerability Assertion</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A Vulnerability Disclosure Report (VDR) which asserts the known and previously unknown vulnerabilities that affect a component, service, or product including the analysis and findings describing the impact (or lack of impact) that the reported vulnerability has on a component, service, or product.
	 * <!-- end-model-doc -->
	 * @see #VULNERABILITY_ASSERTION
	 * @model name="vulnerabilityAssertion" literal="vulnerability-assertion"
	 * @generated
	 * @ordered
	 */
	public static final int VULNERABILITY_ASSERTION_VALUE = 27;

	/**
	 * The '<em><b>Exploitability Statement</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A Vulnerability Exploitability eXchange (VEX) which asserts the known vulnerabilities that do not affect a product, product family, or organization, and optionally the ones that do. The VEX should include the analysis and findings describing the impact (or lack of impact) that the reported vulnerability has on the product, product family, or organization.
	 * <!-- end-model-doc -->
	 * @see #EXPLOITABILITY_STATEMENT
	 * @model name="exploitabilityStatement" literal="exploitability-statement"
	 * @generated
	 * @ordered
	 */
	public static final int EXPLOITABILITY_STATEMENT_VALUE = 28;

	/**
	 * The '<em><b>Pentest Report</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Results from an authorized simulated cyberattack on a component or service, otherwise known as a penetration test
	 * <!-- end-model-doc -->
	 * @see #PENTEST_REPORT
	 * @model name="pentestReport" literal="pentest-report"
	 * @generated
	 * @ordered
	 */
	public static final int PENTEST_REPORT_VALUE = 29;

	/**
	 * The '<em><b>Static Analysis Report</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * SARIF or proprietary machine or human-readable report for which static analysis has identified code quality, security, and other potential issues with the source code
	 * <!-- end-model-doc -->
	 * @see #STATIC_ANALYSIS_REPORT
	 * @model name="staticAnalysisReport" literal="static-analysis-report"
	 * @generated
	 * @ordered
	 */
	public static final int STATIC_ANALYSIS_REPORT_VALUE = 30;

	/**
	 * The '<em><b>Dynamic Analysis Report</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Dynamic analysis report that has identified issues such as vulnerabilities and misconfigurations
	 * <!-- end-model-doc -->
	 * @see #DYNAMIC_ANALYSIS_REPORT
	 * @model name="dynamicAnalysisReport" literal="dynamic-analysis-report"
	 * @generated
	 * @ordered
	 */
	public static final int DYNAMIC_ANALYSIS_REPORT_VALUE = 31;

	/**
	 * The '<em><b>Runtime Analysis Report</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Report generated by analyzing the call stack of a running application
	 * <!-- end-model-doc -->
	 * @see #RUNTIME_ANALYSIS_REPORT
	 * @model name="runtimeAnalysisReport" literal="runtime-analysis-report"
	 * @generated
	 * @ordered
	 */
	public static final int RUNTIME_ANALYSIS_REPORT_VALUE = 32;

	/**
	 * The '<em><b>Component Analysis Report</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Report generated by Software Composition Analysis (SCA), container analysis, or other forms of component analysis
	 * <!-- end-model-doc -->
	 * @see #COMPONENT_ANALYSIS_REPORT
	 * @model name="componentAnalysisReport" literal="component-analysis-report"
	 * @generated
	 * @ordered
	 */
	public static final int COMPONENT_ANALYSIS_REPORT_VALUE = 33;

	/**
	 * The '<em><b>Maturity Report</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Report containing a formal assessment of an organization, business unit, or team against a maturity model
	 * <!-- end-model-doc -->
	 * @see #MATURITY_REPORT
	 * @model name="maturityReport" literal="maturity-report"
	 * @generated
	 * @ordered
	 */
	public static final int MATURITY_REPORT_VALUE = 34;

	/**
	 * The '<em><b>Certification Report</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Industry, regulatory, or other certification from an accredited (if applicable) certification body
	 * <!-- end-model-doc -->
	 * @see #CERTIFICATION_REPORT
	 * @model name="certificationReport" literal="certification-report"
	 * @generated
	 * @ordered
	 */
	public static final int CERTIFICATION_REPORT_VALUE = 35;

	/**
	 * The '<em><b>Quality Metrics</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Report or system in which quality metrics can be obtained
	 * <!-- end-model-doc -->
	 * @see #QUALITY_METRICS
	 * @model name="qualityMetrics" literal="quality-metrics"
	 * @generated
	 * @ordered
	 */
	public static final int QUALITY_METRICS_VALUE = 36;

	/**
	 * The '<em><b>Codified Infrastructure</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Code or configuration that defines and provisions virtualized infrastructure, commonly referred to as Infrastructure as Code (IaC)
	 * <!-- end-model-doc -->
	 * @see #CODIFIED_INFRASTRUCTURE
	 * @model name="codifiedInfrastructure" literal="codified-infrastructure"
	 * @generated
	 * @ordered
	 */
	public static final int CODIFIED_INFRASTRUCTURE_VALUE = 37;

	/**
	 * The '<em><b>Poam</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Plans of Action and Milestones (POA&M) complement an "attestation" external reference. POA&M is defined by NIST as a "document that identifies tasks needing to be accomplished. It details resources required to accomplish the elements of the plan, any milestones in meeting the tasks and scheduled completion dates for the milestones".
	 * <!-- end-model-doc -->
	 * @see #POAM
	 * @model name="poam"
	 * @generated
	 * @ordered
	 */
	public static final int POAM_VALUE = 38;

	/**
	 * The '<em><b>Electronic Signature</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An e-signature is commonly a scanned representation of a written signature or a stylized script of the persons name.
	 * <!-- end-model-doc -->
	 * @see #ELECTRONIC_SIGNATURE
	 * @model name="electronicSignature" literal="electronic-signature"
	 * @generated
	 * @ordered
	 */
	public static final int ELECTRONIC_SIGNATURE_VALUE = 39;

	/**
	 * The '<em><b>Digital Signature</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A signature that leverages cryptography, typically public/private key pairs, which provides strong authenticity verification.
	 * <!-- end-model-doc -->
	 * @see #DIGITAL_SIGNATURE
	 * @model name="digitalSignature" literal="digital-signature"
	 * @generated
	 * @ordered
	 */
	public static final int DIGITAL_SIGNATURE_VALUE = 40;

	/**
	 * The '<em><b>Rfc9116</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Document that complies with RFC-9116 (A File Format to Aid in Security Vulnerability Disclosure)
	 * <!-- end-model-doc -->
	 * @see #RFC9116
	 * @model name="rfc9116" literal="rfc-9116"
	 * @generated
	 * @ordered
	 */
	public static final int RFC9116_VALUE = 41;

	/**
	 * The '<em><b>Other</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Use this if no other types accurately describe the purpose of the external reference
	 * <!-- end-model-doc -->
	 * @see #OTHER
	 * @model name="other"
	 * @generated
	 * @ordered
	 */
	public static final int OTHER_VALUE = 42;

	/**
	 * An array of all the '<em><b>External Reference Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ExternalReferenceType[] VALUES_ARRAY =
		new ExternalReferenceType[] {
			VCS,
			ISSUE_TRACKER,
			WEBSITE,
			ADVISORIES,
			BOM,
			MAILING_LIST,
			SOCIAL,
			CHAT,
			DOCUMENTATION,
			SUPPORT,
			SOURCE_DISTRIBUTION,
			DISTRIBUTION,
			DISTRIBUTION_INTAKE,
			LICENSE,
			BUILD_META,
			BUILD_SYSTEM,
			RELEASE_NOTES,
			SECURITY_CONTACT,
			MODEL_CARD,
			LOG,
			CONFIGURATION,
			EVIDENCE,
			FORMULATION,
			ATTESTATION,
			THREAT_MODEL,
			ADVERSARY_MODEL,
			RISK_ASSESSMENT,
			VULNERABILITY_ASSERTION,
			EXPLOITABILITY_STATEMENT,
			PENTEST_REPORT,
			STATIC_ANALYSIS_REPORT,
			DYNAMIC_ANALYSIS_REPORT,
			RUNTIME_ANALYSIS_REPORT,
			COMPONENT_ANALYSIS_REPORT,
			MATURITY_REPORT,
			CERTIFICATION_REPORT,
			QUALITY_METRICS,
			CODIFIED_INFRASTRUCTURE,
			POAM,
			ELECTRONIC_SIGNATURE,
			DIGITAL_SIGNATURE,
			RFC9116,
			OTHER,
		};

	/**
	 * A public read-only list of all the '<em><b>External Reference Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ExternalReferenceType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>External Reference Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ExternalReferenceType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ExternalReferenceType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>External Reference Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ExternalReferenceType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ExternalReferenceType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>External Reference Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ExternalReferenceType get(int value) {
		switch (value) {
			case VCS_VALUE: return VCS;
			case ISSUE_TRACKER_VALUE: return ISSUE_TRACKER;
			case WEBSITE_VALUE: return WEBSITE;
			case ADVISORIES_VALUE: return ADVISORIES;
			case BOM_VALUE: return BOM;
			case MAILING_LIST_VALUE: return MAILING_LIST;
			case SOCIAL_VALUE: return SOCIAL;
			case CHAT_VALUE: return CHAT;
			case DOCUMENTATION_VALUE: return DOCUMENTATION;
			case SUPPORT_VALUE: return SUPPORT;
			case SOURCE_DISTRIBUTION_VALUE: return SOURCE_DISTRIBUTION;
			case DISTRIBUTION_VALUE: return DISTRIBUTION;
			case DISTRIBUTION_INTAKE_VALUE: return DISTRIBUTION_INTAKE;
			case LICENSE_VALUE: return LICENSE;
			case BUILD_META_VALUE: return BUILD_META;
			case BUILD_SYSTEM_VALUE: return BUILD_SYSTEM;
			case RELEASE_NOTES_VALUE: return RELEASE_NOTES;
			case SECURITY_CONTACT_VALUE: return SECURITY_CONTACT;
			case MODEL_CARD_VALUE: return MODEL_CARD;
			case LOG_VALUE: return LOG;
			case CONFIGURATION_VALUE: return CONFIGURATION;
			case EVIDENCE_VALUE: return EVIDENCE;
			case FORMULATION_VALUE: return FORMULATION;
			case ATTESTATION_VALUE: return ATTESTATION;
			case THREAT_MODEL_VALUE: return THREAT_MODEL;
			case ADVERSARY_MODEL_VALUE: return ADVERSARY_MODEL;
			case RISK_ASSESSMENT_VALUE: return RISK_ASSESSMENT;
			case VULNERABILITY_ASSERTION_VALUE: return VULNERABILITY_ASSERTION;
			case EXPLOITABILITY_STATEMENT_VALUE: return EXPLOITABILITY_STATEMENT;
			case PENTEST_REPORT_VALUE: return PENTEST_REPORT;
			case STATIC_ANALYSIS_REPORT_VALUE: return STATIC_ANALYSIS_REPORT;
			case DYNAMIC_ANALYSIS_REPORT_VALUE: return DYNAMIC_ANALYSIS_REPORT;
			case RUNTIME_ANALYSIS_REPORT_VALUE: return RUNTIME_ANALYSIS_REPORT;
			case COMPONENT_ANALYSIS_REPORT_VALUE: return COMPONENT_ANALYSIS_REPORT;
			case MATURITY_REPORT_VALUE: return MATURITY_REPORT;
			case CERTIFICATION_REPORT_VALUE: return CERTIFICATION_REPORT;
			case QUALITY_METRICS_VALUE: return QUALITY_METRICS;
			case CODIFIED_INFRASTRUCTURE_VALUE: return CODIFIED_INFRASTRUCTURE;
			case POAM_VALUE: return POAM;
			case ELECTRONIC_SIGNATURE_VALUE: return ELECTRONIC_SIGNATURE;
			case DIGITAL_SIGNATURE_VALUE: return DIGITAL_SIGNATURE;
			case RFC9116_VALUE: return RFC9116;
			case OTHER_VALUE: return OTHER;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ExternalReferenceType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //ExternalReferenceType
