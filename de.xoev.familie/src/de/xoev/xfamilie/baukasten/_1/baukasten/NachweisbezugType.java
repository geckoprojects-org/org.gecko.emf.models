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
 * A representation of the model object '<em><b>Nachweisbezug Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Bezug eines Informationselements aus einem Antrag zu einem durchgeführten Datenabruf (z. B. einem Register) bzw. zu einer durchgeführten Datenübernahme (z. B. aus einem Servicekonto oder einer eID).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.NachweisbezugType#getDatenabrufBezug <em>Datenabruf Bezug</em>}</li>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.NachweisbezugType#getDatenabrufId <em>Datenabruf Id</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.baukasten._1.baukasten.BaukastenPackage#getNachweisbezugType()
 * @model extendedMetaData="name='NachweisbezugType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface NachweisbezugType extends EObject {
	/**
	 * Returns the value of the '<em><b>Datenabruf Bezug</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datenabruf Bezug</em>' containment reference.
	 * @see #setDatenabrufBezug(CodeNachweisbezugType)
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.BaukastenPackage#getNachweisbezugType_DatenabrufBezug()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='datenabruf.bezug' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeNachweisbezugType getDatenabrufBezug();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.baukasten._1.baukasten.NachweisbezugType#getDatenabrufBezug <em>Datenabruf Bezug</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datenabruf Bezug</em>' containment reference.
	 * @see #getDatenabrufBezug()
	 * @generated
	 */
	void setDatenabrufBezug(CodeNachweisbezugType value);

	/**
	 * Returns the value of the '<em><b>Datenabruf Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf ein Datenabruf-Element in derselben Nachricht
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Datenabruf Id</em>' attribute.
	 * @see #setDatenabrufId(String)
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.BaukastenPackage#getNachweisbezugType_DatenabrufId()
	 * @model dataType="de.xoev.xfamilie.baukasten._1.baukasten.UUIDType" required="true"
	 *        extendedMetaData="kind='element' name='datenabruf.id' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDatenabrufId();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.baukasten._1.baukasten.NachweisbezugType#getDatenabrufId <em>Datenabruf Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datenabruf Id</em>' attribute.
	 * @see #getDatenabrufId()
	 * @generated
	 */
	void setDatenabrufId(String value);

} // NachweisbezugType
