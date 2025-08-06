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
 * A representation of the model object '<em><b>Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 3.0.0+
 * This element describes all of the classpath resources associated with a project
 *         or unit tests.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.apache.maven.pom.pom.Resource#getTargetPath <em>Target Path</em>}</li>
 *   <li>{@link org.apache.maven.pom.pom.Resource#getFiltering <em>Filtering</em>}</li>
 *   <li>{@link org.apache.maven.pom.pom.Resource#getDirectory <em>Directory</em>}</li>
 *   <li>{@link org.apache.maven.pom.pom.Resource#getIncludes <em>Includes</em>}</li>
 *   <li>{@link org.apache.maven.pom.pom.Resource#getExcludes <em>Excludes</em>}</li>
 * </ul>
 *
 * @see org.apache.maven.pom.pom.POMPackage#getResource()
 * @model extendedMetaData="name='Resource' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface Resource extends EObject {
	/**
	 * Returns the value of the '<em><b>Target Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 3.0.0+
	 * 
	 *             
	 *             Describe the resource target path. The path is relative to the target/classes
	 *             directory (i.e. <code>${project.build.outputDirectory}</code>).
	 *             For example, if you want that resource to appear in a specific package
	 *             (<code>org.apache.maven.messages</code>), you must specify this
	 *             element with this value: <code>org/apache/maven/messages</code>.
	 *             This is not required if you simply put the resources in that directory
	 *             structure at the source, however.
	 *             
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target Path</em>' attribute.
	 * @see #setTargetPath(String)
	 * @see org.apache.maven.pom.pom.POMPackage#getResource_TargetPath()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='targetPath' namespace='##targetNamespace'"
	 * @generated
	 */
	String getTargetPath();

	/**
	 * Sets the value of the '{@link org.apache.maven.pom.pom.Resource#getTargetPath <em>Target Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Path</em>' attribute.
	 * @see #getTargetPath()
	 * @generated
	 */
	void setTargetPath(String value);

	/**
	 * Returns the value of the '<em><b>Filtering</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 3.0.0+
	 * 
	 *             
	 *             Whether resources are filtered to replace tokens with parameterised values or not.
	 *             The values are taken from the <code>properties</code> element and from the
	 *             properties in the files listed in the <code>filters</code> element. Note: While the type
	 *             of this field is <code>String</code> for technical reasons, the semantic type is actually
	 *             <code>Boolean</code>. Default value is <code>false</code>.
	 *             
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Filtering</em>' attribute.
	 * @see #setFiltering(String)
	 * @see org.apache.maven.pom.pom.POMPackage#getResource_Filtering()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='filtering' namespace='##targetNamespace'"
	 * @generated
	 */
	String getFiltering();

	/**
	 * Sets the value of the '{@link org.apache.maven.pom.pom.Resource#getFiltering <em>Filtering</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filtering</em>' attribute.
	 * @see #getFiltering()
	 * @generated
	 */
	void setFiltering(String value);

	/**
	 * Returns the value of the '<em><b>Directory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 3.0.0+
	 * Describe the directory where the resources are stored. The path is relative
	 *             to the POM.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Directory</em>' attribute.
	 * @see #setDirectory(String)
	 * @see org.apache.maven.pom.pom.POMPackage#getResource_Directory()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='directory' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDirectory();

	/**
	 * Sets the value of the '{@link org.apache.maven.pom.pom.Resource#getDirectory <em>Directory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Directory</em>' attribute.
	 * @see #getDirectory()
	 * @generated
	 */
	void setDirectory(String value);

	/**
	 * Returns the value of the '<em><b>Includes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 3.0.0+
	 * 
	 *             
	 *             A list of patterns to include, e.g. <code>**&#47;*.xml</code>.
	 *             
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Includes</em>' containment reference.
	 * @see #setIncludes(IncludesType)
	 * @see org.apache.maven.pom.pom.POMPackage#getResource_Includes()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='includes' namespace='##targetNamespace'"
	 * @generated
	 */
	IncludesType getIncludes();

	/**
	 * Sets the value of the '{@link org.apache.maven.pom.pom.Resource#getIncludes <em>Includes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Includes</em>' containment reference.
	 * @see #getIncludes()
	 * @generated
	 */
	void setIncludes(IncludesType value);

	/**
	 * Returns the value of the '<em><b>Excludes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 3.0.0+
	 * 
	 *             
	 *             A list of patterns to exclude, e.g. <code>**&#47;*.xml</code>
	 *             
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Excludes</em>' containment reference.
	 * @see #setExcludes(ExcludesType)
	 * @see org.apache.maven.pom.pom.POMPackage#getResource_Excludes()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='excludes' namespace='##targetNamespace'"
	 * @generated
	 */
	ExcludesType getExcludes();

	/**
	 * Sets the value of the '{@link org.apache.maven.pom.pom.Resource#getExcludes <em>Excludes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Excludes</em>' containment reference.
	 * @see #getExcludes()
	 * @generated
	 */
	void setExcludes(ExcludesType value);

} // Resource
