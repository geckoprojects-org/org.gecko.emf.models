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
 * A representation of the model object '<em><b>Scm</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 4.0.0+
 * 
 *         
 *         The <code>&lt;scm&gt;</code> element contains informations required to the SCM
 *         (Source Control Management) of the project.
 *         
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.apache.maven.pom.pom.Scm#getConnection <em>Connection</em>}</li>
 *   <li>{@link org.apache.maven.pom.pom.Scm#getDeveloperConnection <em>Developer Connection</em>}</li>
 *   <li>{@link org.apache.maven.pom.pom.Scm#getTag <em>Tag</em>}</li>
 *   <li>{@link org.apache.maven.pom.pom.Scm#getUrl <em>Url</em>}</li>
 *   <li>{@link org.apache.maven.pom.pom.Scm#getChildScmConnectionInheritAppendPath <em>Child Scm Connection Inherit Append Path</em>}</li>
 *   <li>{@link org.apache.maven.pom.pom.Scm#getChildScmDeveloperConnectionInheritAppendPath <em>Child Scm Developer Connection Inherit Append Path</em>}</li>
 *   <li>{@link org.apache.maven.pom.pom.Scm#getChildScmUrlInheritAppendPath <em>Child Scm Url Inherit Append Path</em>}</li>
 * </ul>
 *
 * @see org.apache.maven.pom.pom.POMPackage#getScm()
 * @model extendedMetaData="name='Scm' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface Scm extends EObject {
	/**
	 * Returns the value of the '<em><b>Connection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 4.0.0+
	 * 
	 *             
	 *             The source control management system URL
	 *             that describes the repository and how to connect to the
	 *             repository. For more information, see the
	 *             <a href="https://maven.apache.org/scm/scm-url-format.html">URL format</a>
	 *             and <a href="https://maven.apache.org/scm/scms-overview.html">list of supported SCMs</a>.
	 *             This connection is read-only.
	 *             <br><b>Default value is</b>: parent value [+ path adjustment] + (artifactId or project.directory property), or just parent value if
	 *             scm's <code>child.scm.connection.inherit.append.path="false"</code>
	 *             
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Connection</em>' attribute.
	 * @see #setConnection(String)
	 * @see org.apache.maven.pom.pom.POMPackage#getScm_Connection()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='connection' namespace='##targetNamespace'"
	 * @generated
	 */
	String getConnection();

	/**
	 * Sets the value of the '{@link org.apache.maven.pom.pom.Scm#getConnection <em>Connection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connection</em>' attribute.
	 * @see #getConnection()
	 * @generated
	 */
	void setConnection(String value);

	/**
	 * Returns the value of the '<em><b>Developer Connection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 4.0.0+
	 * 
	 *             
	 *             Just like <code>connection</code>, but for developers, i.e. this scm connection
	 *             will not be read only.
	 *             <br><b>Default value is</b>: parent value [+ path adjustment] + (artifactId or project.directory property), or just parent value if
	 *             scm's <code>child.scm.developerConnection.inherit.append.path="false"</code>
	 *             
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Developer Connection</em>' attribute.
	 * @see #setDeveloperConnection(String)
	 * @see org.apache.maven.pom.pom.POMPackage#getScm_DeveloperConnection()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='developerConnection' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDeveloperConnection();

	/**
	 * Sets the value of the '{@link org.apache.maven.pom.pom.Scm#getDeveloperConnection <em>Developer Connection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Developer Connection</em>' attribute.
	 * @see #getDeveloperConnection()
	 * @generated
	 */
	void setDeveloperConnection(String value);

	/**
	 * Returns the value of the '<em><b>Tag</b></em>' attribute.
	 * The default value is <code>"HEAD"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 4.0.0+
	 * The tag of current code. By default, it's set to HEAD during development.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tag</em>' attribute.
	 * @see #isSetTag()
	 * @see #unsetTag()
	 * @see #setTag(String)
	 * @see org.apache.maven.pom.pom.POMPackage#getScm_Tag()
	 * @model default="HEAD" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='tag' namespace='##targetNamespace'"
	 * @generated
	 */
	String getTag();

	/**
	 * Sets the value of the '{@link org.apache.maven.pom.pom.Scm#getTag <em>Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tag</em>' attribute.
	 * @see #isSetTag()
	 * @see #unsetTag()
	 * @see #getTag()
	 * @generated
	 */
	void setTag(String value);

	/**
	 * Unsets the value of the '{@link org.apache.maven.pom.pom.Scm#getTag <em>Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTag()
	 * @see #getTag()
	 * @see #setTag(String)
	 * @generated
	 */
	void unsetTag();

	/**
	 * Returns whether the value of the '{@link org.apache.maven.pom.pom.Scm#getTag <em>Tag</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Tag</em>' attribute is set.
	 * @see #unsetTag()
	 * @see #getTag()
	 * @see #setTag(String)
	 * @generated
	 */
	boolean isSetTag();

	/**
	 * Returns the value of the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 4.0.0+
	 * 
	 *             
	 *             The URL to the project's browsable SCM repository, such as ViewVC or Fisheye.
	 *             <br><b>Default value is</b>: parent value [+ path adjustment] + (artifactId or project.directory property), or just parent value if
	 *             scm's <code>child.scm.url.inherit.append.path="false"</code>
	 *             
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Url</em>' attribute.
	 * @see #setUrl(String)
	 * @see org.apache.maven.pom.pom.POMPackage#getScm_Url()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='url' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUrl();

	/**
	 * Sets the value of the '{@link org.apache.maven.pom.pom.Scm#getUrl <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' attribute.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(String value);

	/**
	 * Returns the value of the '<em><b>Child Scm Connection Inherit Append Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 4.0.0+
	 * 
	 *             
	 *             When children inherit from scm connection, append path or not? Note: While the type
	 *             of this field is <code>String</code> for technical reasons, the semantic type is actually
	 *             <code>Boolean</code>
	 *             <br><b>Default value is</b>: <code>true</code>
	 *             <br><b>Since</b>: Maven 3.6.1
	 *             
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Child Scm Connection Inherit Append Path</em>' attribute.
	 * @see #setChildScmConnectionInheritAppendPath(String)
	 * @see org.apache.maven.pom.pom.POMPackage#getScm_ChildScmConnectionInheritAppendPath()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='child.scm.connection.inherit.append.path'"
	 * @generated
	 */
	String getChildScmConnectionInheritAppendPath();

	/**
	 * Sets the value of the '{@link org.apache.maven.pom.pom.Scm#getChildScmConnectionInheritAppendPath <em>Child Scm Connection Inherit Append Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Child Scm Connection Inherit Append Path</em>' attribute.
	 * @see #getChildScmConnectionInheritAppendPath()
	 * @generated
	 */
	void setChildScmConnectionInheritAppendPath(String value);

	/**
	 * Returns the value of the '<em><b>Child Scm Developer Connection Inherit Append Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 4.0.0+
	 * 
	 *             
	 *             When children inherit from scm developer connection, append path or not? Note: While the type
	 *             of this field is <code>String</code> for technical reasons, the semantic type is actually
	 *             <code>Boolean</code>
	 *             <br><b>Default value is</b>: <code>true</code>
	 *             <br><b>Since</b>: Maven 3.6.1
	 *             
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Child Scm Developer Connection Inherit Append Path</em>' attribute.
	 * @see #setChildScmDeveloperConnectionInheritAppendPath(String)
	 * @see org.apache.maven.pom.pom.POMPackage#getScm_ChildScmDeveloperConnectionInheritAppendPath()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='child.scm.developerConnection.inherit.append.path'"
	 * @generated
	 */
	String getChildScmDeveloperConnectionInheritAppendPath();

	/**
	 * Sets the value of the '{@link org.apache.maven.pom.pom.Scm#getChildScmDeveloperConnectionInheritAppendPath <em>Child Scm Developer Connection Inherit Append Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Child Scm Developer Connection Inherit Append Path</em>' attribute.
	 * @see #getChildScmDeveloperConnectionInheritAppendPath()
	 * @generated
	 */
	void setChildScmDeveloperConnectionInheritAppendPath(String value);

	/**
	 * Returns the value of the '<em><b>Child Scm Url Inherit Append Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 4.0.0+
	 * 
	 *             
	 *             When children inherit from scm url, append path or not? Note: While the type
	 *             of this field is <code>String</code> for technical reasons, the semantic type is actually
	 *             <code>Boolean</code>
	 *             <br><b>Default value is</b>: <code>true</code>
	 *             <br><b>Since</b>: Maven 3.6.1
	 *             
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Child Scm Url Inherit Append Path</em>' attribute.
	 * @see #setChildScmUrlInheritAppendPath(String)
	 * @see org.apache.maven.pom.pom.POMPackage#getScm_ChildScmUrlInheritAppendPath()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='child.scm.url.inherit.append.path'"
	 * @generated
	 */
	String getChildScmUrlInheritAppendPath();

	/**
	 * Sets the value of the '{@link org.apache.maven.pom.pom.Scm#getChildScmUrlInheritAppendPath <em>Child Scm Url Inherit Append Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Child Scm Url Inherit Append Path</em>' attribute.
	 * @see #getChildScmUrlInheritAppendPath()
	 * @generated
	 */
	void setChildScmUrlInheritAppendPath(String value);

} // Scm
