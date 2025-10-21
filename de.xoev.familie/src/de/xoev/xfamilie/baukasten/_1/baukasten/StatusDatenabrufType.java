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
package de.xoev.xfamilie.baukasten._1.baukasten;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Status Datenabruf Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Angaben zum Status eines vom Antragsservice durchgeführten Datenabrufs (erfolgreich, nicht erfolgreich, Hinweise)
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.StatusDatenabrufType#getStatus <em>Status</em>}</li>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.StatusDatenabrufType#getHinweis <em>Hinweis</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.baukasten._1.baukasten.BaukastenPackage#getStatusDatenabrufType()
 * @model extendedMetaData="name='StatusDatenabrufType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface StatusDatenabrufType extends EObject {
	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Status-Code
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(CodeStatusDatenabrufType)
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.BaukastenPackage#getStatusDatenabrufType_Status()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='status' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeStatusDatenabrufType getStatus();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.baukasten._1.baukasten.StatusDatenabrufType#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(CodeStatusDatenabrufType value);

	/**
	 * Returns the value of the '<em><b>Hinweis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Hier können weitere Hinweise zum Status angegeben werden, z. B. Melderegister hat innerhalb von 7 Tagen nicht reagiert.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hinweis</em>' attribute.
	 * @see #setHinweis(String)
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.BaukastenPackage#getStatusDatenabrufType_Hinweis()
	 * @model dataType="de.xoev.kosit.datentyp._202204.din91379.DatatypeC"
	 *        extendedMetaData="kind='element' name='hinweis' namespace='##targetNamespace'"
	 * @generated
	 */
	String getHinweis();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.baukasten._1.baukasten.StatusDatenabrufType#getHinweis <em>Hinweis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hinweis</em>' attribute.
	 * @see #getHinweis()
	 * @generated
	 */
	void setHinweis(String value);

} // StatusDatenabrufType
