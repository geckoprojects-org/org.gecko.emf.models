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

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aufenthaltstitel Nachweisbezug Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Angaben zum Aufenthaltstitel.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.AufenthaltstitelNachweisbezugType#getDokumenttyp <em>Dokumenttyp</em>}</li>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.AufenthaltstitelNachweisbezugType#getNebenbestimmungen <em>Nebenbestimmungen</em>}</li>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.AufenthaltstitelNachweisbezugType#getAblaufdatum <em>Ablaufdatum</em>}</li>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.AufenthaltstitelNachweisbezugType#getNachweisbezug <em>Nachweisbezug</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.baukasten._1.baukasten.BaukastenPackage#getAufenthaltstitelNachweisbezugType()
 * @model extendedMetaData="name='Aufenthaltstitel.NachweisbezugType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface AufenthaltstitelNachweisbezugType extends EObject {
	/**
	 * Returns the value of the '<em><b>Dokumenttyp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Dokumenttyp nach ICAO entsprechend DG1 der BSI TR-03127.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dokumenttyp</em>' attribute.
	 * @see #setDokumenttyp(String)
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.BaukastenPackage#getAufenthaltstitelNachweisbezugType_Dokumenttyp()
	 * @model dataType="de.xoev.kosit.datentyp._202204.din91379.DatatypeC" required="true"
	 *        extendedMetaData="kind='element' name='dokumenttyp' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDokumenttyp();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.baukasten._1.baukasten.AufenthaltstitelNachweisbezugType#getDokumenttyp <em>Dokumenttyp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dokumenttyp</em>' attribute.
	 * @see #getDokumenttyp()
	 * @generated
	 */
	void setDokumenttyp(String value);

	/**
	 * Returns the value of the '<em><b>Nebenbestimmungen</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Im eAT verzeichnete Nebenbestimmungen entsprechend DG19 und DG20 der BSI TR-03127.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nebenbestimmungen</em>' attribute list.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.BaukastenPackage#getAufenthaltstitelNachweisbezugType_Nebenbestimmungen()
	 * @model unique="false" dataType="de.xoev.kosit.datentyp._202204.din91379.DatatypeC" upper="2"
	 *        extendedMetaData="kind='element' name='nebenbestimmungen' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getNebenbestimmungen();

	/**
	 * Returns the value of the '<em><b>Ablaufdatum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ablaufdatum des eAT ensprechend DG3 der BSI TR-03127.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ablaufdatum</em>' attribute.
	 * @see #setAblaufdatum(XMLGregorianCalendar)
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.BaukastenPackage#getAufenthaltstitelNachweisbezugType_Ablaufdatum()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Date"
	 *        extendedMetaData="kind='element' name='ablaufdatum' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getAblaufdatum();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.baukasten._1.baukasten.AufenthaltstitelNachweisbezugType#getAblaufdatum <em>Ablaufdatum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ablaufdatum</em>' attribute.
	 * @see #getAblaufdatum()
	 * @generated
	 */
	void setAblaufdatum(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Nachweisbezug</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nachweisbezug</em>' containment reference.
	 * @see #setNachweisbezug(NachweisbezugType)
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.BaukastenPackage#getAufenthaltstitelNachweisbezugType_Nachweisbezug()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='nachweisbezug' namespace='##targetNamespace'"
	 * @generated
	 */
	NachweisbezugType getNachweisbezug();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.baukasten._1.baukasten.AufenthaltstitelNachweisbezugType#getNachweisbezug <em>Nachweisbezug</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nachweisbezug</em>' containment reference.
	 * @see #getNachweisbezug()
	 * @generated
	 */
	void setNachweisbezug(NachweisbezugType value);

} // AufenthaltstitelNachweisbezugType
