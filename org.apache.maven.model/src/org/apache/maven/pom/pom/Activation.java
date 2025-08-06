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
 * A representation of the model object '<em><b>Activation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 4.0.0+
 * The conditions within the build runtime environment which will trigger the
 *         automatic inclusion of the build profile. Multiple conditions can be defined, which must
 *         be all satisfied to activate the profile.
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.apache.maven.pom.pom.Activation#isActiveByDefault <em>Active By Default</em>}</li>
 *   <li>{@link org.apache.maven.pom.pom.Activation#getJdk <em>Jdk</em>}</li>
 *   <li>{@link org.apache.maven.pom.pom.Activation#getOs <em>Os</em>}</li>
 *   <li>{@link org.apache.maven.pom.pom.Activation#getProperty <em>Property</em>}</li>
 *   <li>{@link org.apache.maven.pom.pom.Activation#getFile <em>File</em>}</li>
 * </ul>
 *
 * @see org.apache.maven.pom.pom.POMPackage#getActivation()
 * @model extendedMetaData="name='Activation' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface Activation extends EObject {
	/**
	 * Returns the value of the '<em><b>Active By Default</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 4.0.0+
	 * If set to true, this profile will be active unless another profile in this
	 *             pom is activated using the command line -P option or by one of that profile's
	 *             activators.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Active By Default</em>' attribute.
	 * @see #isSetActiveByDefault()
	 * @see #unsetActiveByDefault()
	 * @see #setActiveByDefault(boolean)
	 * @see org.apache.maven.pom.pom.POMPackage#getActivation_ActiveByDefault()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='activeByDefault' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isActiveByDefault();

	/**
	 * Sets the value of the '{@link org.apache.maven.pom.pom.Activation#isActiveByDefault <em>Active By Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Active By Default</em>' attribute.
	 * @see #isSetActiveByDefault()
	 * @see #unsetActiveByDefault()
	 * @see #isActiveByDefault()
	 * @generated
	 */
	void setActiveByDefault(boolean value);

	/**
	 * Unsets the value of the '{@link org.apache.maven.pom.pom.Activation#isActiveByDefault <em>Active By Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetActiveByDefault()
	 * @see #isActiveByDefault()
	 * @see #setActiveByDefault(boolean)
	 * @generated
	 */
	void unsetActiveByDefault();

	/**
	 * Returns whether the value of the '{@link org.apache.maven.pom.pom.Activation#isActiveByDefault <em>Active By Default</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Active By Default</em>' attribute is set.
	 * @see #unsetActiveByDefault()
	 * @see #isActiveByDefault()
	 * @see #setActiveByDefault(boolean)
	 * @generated
	 */
	boolean isSetActiveByDefault();

	/**
	 * Returns the value of the '<em><b>Jdk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 4.0.0+
	 * 
	 *             
	 *             Specifies that this profile will be activated when a matching JDK is detected.
	 *             For example, <code>1.4</code> only activates on JDKs versioned 1.4,
	 *             while <code>!1.4</code> matches any JDK that is not version 1.4. Ranges are supported too:
	 *             <code>[1.5,)</code> activates when the JDK is 1.5 minimum.
	 *             
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Jdk</em>' attribute.
	 * @see #setJdk(String)
	 * @see org.apache.maven.pom.pom.POMPackage#getActivation_Jdk()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='jdk' namespace='##targetNamespace'"
	 * @generated
	 */
	String getJdk();

	/**
	 * Sets the value of the '{@link org.apache.maven.pom.pom.Activation#getJdk <em>Jdk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jdk</em>' attribute.
	 * @see #getJdk()
	 * @generated
	 */
	void setJdk(String value);

	/**
	 * Returns the value of the '<em><b>Os</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 4.0.0+
	 * Specifies that this profile will be activated when matching operating system
	 *             attributes are detected.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Os</em>' containment reference.
	 * @see #setOs(ActivationOS)
	 * @see org.apache.maven.pom.pom.POMPackage#getActivation_Os()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='os' namespace='##targetNamespace'"
	 * @generated
	 */
	ActivationOS getOs();

	/**
	 * Sets the value of the '{@link org.apache.maven.pom.pom.Activation#getOs <em>Os</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Os</em>' containment reference.
	 * @see #getOs()
	 * @generated
	 */
	void setOs(ActivationOS value);

	/**
	 * Returns the value of the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 4.0.0+
	 * Specifies that this profile will be activated when this property is
	 *             specified.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Property</em>' containment reference.
	 * @see #setProperty(ActivationProperty)
	 * @see org.apache.maven.pom.pom.POMPackage#getActivation_Property()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='property' namespace='##targetNamespace'"
	 * @generated
	 */
	ActivationProperty getProperty();

	/**
	 * Sets the value of the '{@link org.apache.maven.pom.pom.Activation#getProperty <em>Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property</em>' containment reference.
	 * @see #getProperty()
	 * @generated
	 */
	void setProperty(ActivationProperty value);

	/**
	 * Returns the value of the '<em><b>File</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 4.0.0+
	 * Specifies that this profile will be activated based on existence of a file.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>File</em>' containment reference.
	 * @see #setFile(ActivationFile)
	 * @see org.apache.maven.pom.pom.POMPackage#getActivation_File()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='file' namespace='##targetNamespace'"
	 * @generated
	 */
	ActivationFile getFile();

	/**
	 * Sets the value of the '{@link org.apache.maven.pom.pom.Activation#getFile <em>File</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File</em>' containment reference.
	 * @see #getFile()
	 * @generated
	 */
	void setFile(ActivationFile value);

} // Activation
