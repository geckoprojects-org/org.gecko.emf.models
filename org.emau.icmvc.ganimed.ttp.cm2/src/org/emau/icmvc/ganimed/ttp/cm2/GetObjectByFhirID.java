/*
 * Copyright (c) 2012 - 2024 Data In Motion and others.
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
package org.emau.icmvc.ganimed.ttp.cm2;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Get Object By Fhir ID</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.GetObjectByFhirID#getClazz <em>Clazz</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.GetObjectByFhirID#getFhirID <em>Fhir ID</em>}</li>
 * </ul>
 *
 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getGetObjectByFhirID()
 * @model extendedMetaData="name='getObjectByFhirID' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface GetObjectByFhirID extends EObject {
	/**
	 * Returns the value of the '<em><b>Clazz</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clazz</em>' attribute.
	 * @see #setClazz(String)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getGetObjectByFhirID_Clazz()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='clazz'"
	 * @generated
	 */
	String getClazz();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.GetObjectByFhirID#getClazz <em>Clazz</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clazz</em>' attribute.
	 * @see #getClazz()
	 * @generated
	 */
	void setClazz(String value);

	/**
	 * Returns the value of the '<em><b>Fhir ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fhir ID</em>' attribute.
	 * @see #setFhirID(String)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getGetObjectByFhirID_FhirID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='fhirID'"
	 * @generated
	 */
	String getFhirID();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.GetObjectByFhirID#getFhirID <em>Fhir ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fhir ID</em>' attribute.
	 * @see #getFhirID()
	 * @generated
	 */
	void setFhirID(String value);

} // GetObjectByFhirID
