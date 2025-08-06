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
 * A representation of the model object '<em><b>Reporting</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 4.0.0+
 * Section for management of reports and their configuration.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.apache.maven.pom.pom.Reporting#getExcludeDefaults <em>Exclude Defaults</em>}</li>
 *   <li>{@link org.apache.maven.pom.pom.Reporting#getOutputDirectory <em>Output Directory</em>}</li>
 *   <li>{@link org.apache.maven.pom.pom.Reporting#getPlugins <em>Plugins</em>}</li>
 * </ul>
 *
 * @see org.apache.maven.pom.pom.POMPackage#getReporting()
 * @model extendedMetaData="name='Reporting' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface Reporting extends EObject {
	/**
	 * Returns the value of the '<em><b>Exclude Defaults</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 4.0.0+
	 * 
	 *             
	 *             If true, then the default reports are not included in the site generation.
	 *             This includes the reports in the "Project Info" menu. Note: While the type
	 *             of this field is <code>String</code> for technical reasons, the semantic type is actually
	 *             <code>Boolean</code>. Default value is <code>false</code>.
	 *             
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Exclude Defaults</em>' attribute.
	 * @see #setExcludeDefaults(String)
	 * @see org.apache.maven.pom.pom.POMPackage#getReporting_ExcludeDefaults()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='excludeDefaults' namespace='##targetNamespace'"
	 * @generated
	 */
	String getExcludeDefaults();

	/**
	 * Sets the value of the '{@link org.apache.maven.pom.pom.Reporting#getExcludeDefaults <em>Exclude Defaults</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exclude Defaults</em>' attribute.
	 * @see #getExcludeDefaults()
	 * @generated
	 */
	void setExcludeDefaults(String value);

	/**
	 * Returns the value of the '<em><b>Output Directory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 4.0.0+
	 * 
	 *             
	 *             Where to store all of the generated reports. The default is
	 *             <code>${project.build.directory}/site</code>.
	 *             
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Output Directory</em>' attribute.
	 * @see #setOutputDirectory(String)
	 * @see org.apache.maven.pom.pom.POMPackage#getReporting_OutputDirectory()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='outputDirectory' namespace='##targetNamespace'"
	 * @generated
	 */
	String getOutputDirectory();

	/**
	 * Sets the value of the '{@link org.apache.maven.pom.pom.Reporting#getOutputDirectory <em>Output Directory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Directory</em>' attribute.
	 * @see #getOutputDirectory()
	 * @generated
	 */
	void setOutputDirectory(String value);

	/**
	 * Returns the value of the '<em><b>Plugins</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 4.0.0+
	 * The reporting plugins to use and their configuration.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Plugins</em>' containment reference.
	 * @see #setPlugins(PluginsType2)
	 * @see org.apache.maven.pom.pom.POMPackage#getReporting_Plugins()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='plugins' namespace='##targetNamespace'"
	 * @generated
	 */
	PluginsType2 getPlugins();

	/**
	 * Sets the value of the '{@link org.apache.maven.pom.pom.Reporting#getPlugins <em>Plugins</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plugins</em>' containment reference.
	 * @see #getPlugins()
	 * @generated
	 */
	void setPlugins(PluginsType2 value);

} // Reporting
