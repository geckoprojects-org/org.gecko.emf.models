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
 * A representation of the model object '<em><b>Activation File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 4.0.0+
 * This is the file specification used to activate the profile. The <code>missing</code> value
 *         is the location of a file that needs to exist, and if it doesn't, the profile will be
 *         activated. On the other hand, <code>exists</code> will test for the existence of the file and if it is
 *         there, the profile will be activated.<br>
 *         Variable interpolation for these file specifications is limited to <code>${project.basedir}</code>,
 *         system properties and user properties.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.apache.maven.pom.pom.ActivationFile#getMissing <em>Missing</em>}</li>
 *   <li>{@link org.apache.maven.pom.pom.ActivationFile#getExists <em>Exists</em>}</li>
 * </ul>
 *
 * @see org.apache.maven.pom.pom.POMPackage#getActivationFile()
 * @model extendedMetaData="name='ActivationFile' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ActivationFile extends EObject {
	/**
	 * Returns the value of the '<em><b>Missing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 4.0.0+
	 * The name of the file that must be missing to activate the
	 *           profile.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Missing</em>' attribute.
	 * @see #setMissing(String)
	 * @see org.apache.maven.pom.pom.POMPackage#getActivationFile_Missing()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='missing' namespace='##targetNamespace'"
	 * @generated
	 */
	String getMissing();

	/**
	 * Sets the value of the '{@link org.apache.maven.pom.pom.ActivationFile#getMissing <em>Missing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Missing</em>' attribute.
	 * @see #getMissing()
	 * @generated
	 */
	void setMissing(String value);

	/**
	 * Returns the value of the '<em><b>Exists</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 4.0.0+
	 * The name of the file that must exist to activate the profile.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Exists</em>' attribute.
	 * @see #setExists(String)
	 * @see org.apache.maven.pom.pom.POMPackage#getActivationFile_Exists()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='exists' namespace='##targetNamespace'"
	 * @generated
	 */
	String getExists();

	/**
	 * Sets the value of the '{@link org.apache.maven.pom.pom.ActivationFile#getExists <em>Exists</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exists</em>' attribute.
	 * @see #getExists()
	 * @generated
	 */
	void setExists(String value);

} // ActivationFile
