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
 * A representation of the model object '<em><b>Prerequisites</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 4.0.0+
 * Describes the prerequisites a project can have.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.apache.maven.pom.pom.Prerequisites#getMaven <em>Maven</em>}</li>
 * </ul>
 *
 * @see org.apache.maven.pom.pom.POMPackage#getPrerequisites()
 * @model extendedMetaData="name='Prerequisites' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface Prerequisites extends EObject {
	/**
	 * Returns the value of the '<em><b>Maven</b></em>' attribute.
	 * The default value is <code>"2.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 4.0.0+
	 * 
	 *             For a plugin project (packaging is <code>maven-plugin</code>), the minimum version of
	 *             Maven required to use the resulting plugin.
	 *             
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Maven</em>' attribute.
	 * @see #isSetMaven()
	 * @see #unsetMaven()
	 * @see #setMaven(String)
	 * @see org.apache.maven.pom.pom.POMPackage#getPrerequisites_Maven()
	 * @model default="2.0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='maven' namespace='##targetNamespace'"
	 * @generated
	 */
	String getMaven();

	/**
	 * Sets the value of the '{@link org.apache.maven.pom.pom.Prerequisites#getMaven <em>Maven</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maven</em>' attribute.
	 * @see #isSetMaven()
	 * @see #unsetMaven()
	 * @see #getMaven()
	 * @generated
	 */
	void setMaven(String value);

	/**
	 * Unsets the value of the '{@link org.apache.maven.pom.pom.Prerequisites#getMaven <em>Maven</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMaven()
	 * @see #getMaven()
	 * @see #setMaven(String)
	 * @generated
	 */
	void unsetMaven();

	/**
	 * Returns whether the value of the '{@link org.apache.maven.pom.pom.Prerequisites#getMaven <em>Maven</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Maven</em>' attribute is set.
	 * @see #unsetMaven()
	 * @see #getMaven()
	 * @see #setMaven(String)
	 * @generated
	 */
	boolean isSetMaven();

} // Prerequisites
