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
package org.apache.maven.pom.pom;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Report Plugin</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 4.0.0+
 * 
 *         
 *         The <code>&lt;plugin&gt;</code> element in <code>&lt;reporting&gt;&lt;plugins&gt;</code> contains informations required for a report plugin.
 *         
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.apache.maven.pom.pom.ReportPlugin#getGroupId <em>Group Id</em>}</li>
 *   <li>{@link org.apache.maven.pom.pom.ReportPlugin#getArtifactId <em>Artifact Id</em>}</li>
 *   <li>{@link org.apache.maven.pom.pom.ReportPlugin#getVersion <em>Version</em>}</li>
 *   <li>{@link org.apache.maven.pom.pom.ReportPlugin#getReportSets <em>Report Sets</em>}</li>
 *   <li>{@link org.apache.maven.pom.pom.ReportPlugin#getInherited <em>Inherited</em>}</li>
 *   <li>{@link org.apache.maven.pom.pom.ReportPlugin#getConfiguration <em>Configuration</em>}</li>
 * </ul>
 *
 * @see org.apache.maven.pom.pom.POMPackage#getReportPlugin()
 * @model extendedMetaData="name='ReportPlugin' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ReportPlugin extends EObject {
	/**
	 * Returns the value of the '<em><b>Group Id</b></em>' attribute.
	 * The default value is <code>"org.apache.maven.plugins"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 4.0.0+
	 * The group ID of the reporting plugin in the repository.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Group Id</em>' attribute.
	 * @see #isSetGroupId()
	 * @see #unsetGroupId()
	 * @see #setGroupId(String)
	 * @see org.apache.maven.pom.pom.POMPackage#getReportPlugin_GroupId()
	 * @model default="org.apache.maven.plugins" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='groupId' namespace='##targetNamespace'"
	 * @generated
	 */
	String getGroupId();

	/**
	 * Sets the value of the '{@link org.apache.maven.pom.pom.ReportPlugin#getGroupId <em>Group Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group Id</em>' attribute.
	 * @see #isSetGroupId()
	 * @see #unsetGroupId()
	 * @see #getGroupId()
	 * @generated
	 */
	void setGroupId(String value);

	/**
	 * Unsets the value of the '{@link org.apache.maven.pom.pom.ReportPlugin#getGroupId <em>Group Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetGroupId()
	 * @see #getGroupId()
	 * @see #setGroupId(String)
	 * @generated
	 */
	void unsetGroupId();

	/**
	 * Returns whether the value of the '{@link org.apache.maven.pom.pom.ReportPlugin#getGroupId <em>Group Id</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Group Id</em>' attribute is set.
	 * @see #unsetGroupId()
	 * @see #getGroupId()
	 * @see #setGroupId(String)
	 * @generated
	 */
	boolean isSetGroupId();

	/**
	 * Returns the value of the '<em><b>Artifact Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 4.0.0+
	 * The artifact ID of the reporting plugin in the repository.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Artifact Id</em>' attribute.
	 * @see #setArtifactId(String)
	 * @see org.apache.maven.pom.pom.POMPackage#getReportPlugin_ArtifactId()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='artifactId' namespace='##targetNamespace'"
	 * @generated
	 */
	String getArtifactId();

	/**
	 * Sets the value of the '{@link org.apache.maven.pom.pom.ReportPlugin#getArtifactId <em>Artifact Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Artifact Id</em>' attribute.
	 * @see #getArtifactId()
	 * @generated
	 */
	void setArtifactId(String value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 4.0.0+
	 * 
	 *             
	 *             The version of the reporting plugin to be used. Starting with Maven 3, if no version is defined explicitely,
	 *             version is searched in <code>build/plugins</code> then in <code>build/pluginManagement</code>.
	 *             
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see org.apache.maven.pom.pom.POMPackage#getReportPlugin_Version()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='version' namespace='##targetNamespace'"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link org.apache.maven.pom.pom.ReportPlugin#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>Report Sets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 4.0.0+
	 * 
	 *             
	 *             Multiple specifications of a set of reports, each having (possibly) different
	 *             configuration. This is the reporting parallel to an <code>execution</code> in the build.
	 *             
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Report Sets</em>' containment reference.
	 * @see #setReportSets(ReportSetsType)
	 * @see org.apache.maven.pom.pom.POMPackage#getReportPlugin_ReportSets()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='reportSets' namespace='##targetNamespace'"
	 * @generated
	 */
	ReportSetsType getReportSets();

	/**
	 * Sets the value of the '{@link org.apache.maven.pom.pom.ReportPlugin#getReportSets <em>Report Sets</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Report Sets</em>' containment reference.
	 * @see #getReportSets()
	 * @generated
	 */
	void setReportSets(ReportSetsType value);

	/**
	 * Returns the value of the '<em><b>Inherited</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 4.0.0+
	 * 
	 *             
	 *             Whether any configuration should be propagated to child POMs. Note: While the type
	 *             of this field is <code>String</code> for technical reasons, the semantic type is actually
	 *             <code>Boolean</code>. Default value is <code>true</code>.
	 *             
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Inherited</em>' attribute.
	 * @see #setInherited(String)
	 * @see org.apache.maven.pom.pom.POMPackage#getReportPlugin_Inherited()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='inherited' namespace='##targetNamespace'"
	 * @generated
	 */
	String getInherited();

	/**
	 * Sets the value of the '{@link org.apache.maven.pom.pom.ReportPlugin#getInherited <em>Inherited</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inherited</em>' attribute.
	 * @see #getInherited()
	 * @generated
	 */
	void setInherited(String value);

	/**
	 * Returns the value of the '<em><b>Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 0.0.0+
	 * 
	 *             
	 *             <p>The configuration as DOM object.</p>
	 *             <p>By default, every element content is trimmed, but starting with Maven 3.1.0, you can add
	 *             <code>xml:space="preserve"</code> to elements you want to preserve whitespace.</p>
	 *             <p>You can control how child POMs inherit configuration from parent POMs by adding <code>combine.children</code>
	 *             or <code>combine.self</code> attributes to the children of the configuration element:</p>
	 *             <ul>
	 *             <li><code>combine.children</code>: available values are <code>merge</code> (default) and <code>append</code>,</li>
	 *             <li><code>combine.self</code>: available values are <code>merge</code> (default) and <code>override</code>.</li>
	 *             </ul>
	 *             <p>See <a href="https://maven.apache.org/pom.html#Plugins">POM Reference documentation</a> and
	 *             <a href="https://codehaus-plexus.github.io/plexus-utils/apidocs/org/codehaus/plexus/util/xml/Xpp3DomUtils.html">Xpp3DomUtils</a>
	 *             for more information.</p>
	 *             
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Configuration</em>' containment reference.
	 * @see #setConfiguration(ConfigurationType1)
	 * @see org.apache.maven.pom.pom.POMPackage#getReportPlugin_Configuration()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='configuration' namespace='##targetNamespace'"
	 * @generated
	 */
	ConfigurationType1 getConfiguration();

	/**
	 * Sets the value of the '{@link org.apache.maven.pom.pom.ReportPlugin#getConfiguration <em>Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configuration</em>' containment reference.
	 * @see #getConfiguration()
	 * @generated
	 */
	void setConfiguration(ConfigurationType1 value);

} // ReportPlugin
