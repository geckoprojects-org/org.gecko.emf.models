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

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Teilbekanntes Datum Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Mit diesem Datentyp kann entweder ein vollständig bekanntes oder ein teilweise bekanntes Datum übermittelt werden. Die Angabe einer Zeitzone ist in keinem Fall möglich.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.TeilbekanntesDatumType#getJahrMonatTag <em>Jahr Monat Tag</em>}</li>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.TeilbekanntesDatumType#getJahrMonat <em>Jahr Monat</em>}</li>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.TeilbekanntesDatumType#getJahr <em>Jahr</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.baukasten._1.baukasten.BaukastenPackage#getTeilbekanntesDatumType()
 * @model extendedMetaData="name='TeilbekanntesDatumType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface TeilbekanntesDatumType extends EObject {
	/**
	 * Returns the value of the '<em><b>Jahr Monat Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angabe eines vollständigen Datums
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Jahr Monat Tag</em>' attribute.
	 * @see #setJahrMonatTag(XMLGregorianCalendar)
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.BaukastenPackage#getTeilbekanntesDatumType_JahrMonatTag()
	 * @model dataType="de.xoev.xfamilie.baukasten._1.baukasten.TagesdatumType"
	 *        extendedMetaData="kind='element' name='jahrMonatTag' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getJahrMonatTag();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.baukasten._1.baukasten.TeilbekanntesDatumType#getJahrMonatTag <em>Jahr Monat Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jahr Monat Tag</em>' attribute.
	 * @see #getJahrMonatTag()
	 * @generated
	 */
	void setJahrMonatTag(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Jahr Monat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angabe eines Datums mit Jahr und Monat
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Jahr Monat</em>' attribute.
	 * @see #setJahrMonat(XMLGregorianCalendar)
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.BaukastenPackage#getTeilbekanntesDatumType_JahrMonat()
	 * @model dataType="de.xoev.xfamilie.baukasten._1.baukasten.JahrMonatType"
	 *        extendedMetaData="kind='element' name='jahrMonat' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getJahrMonat();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.baukasten._1.baukasten.TeilbekanntesDatumType#getJahrMonat <em>Jahr Monat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jahr Monat</em>' attribute.
	 * @see #getJahrMonat()
	 * @generated
	 */
	void setJahrMonat(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Jahr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angabe eines Datums durch eine Jahresangabe
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Jahr</em>' attribute.
	 * @see #setJahr(XMLGregorianCalendar)
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.BaukastenPackage#getTeilbekanntesDatumType_Jahr()
	 * @model dataType="de.xoev.xfamilie.baukasten._1.baukasten.JahrType"
	 *        extendedMetaData="kind='element' name='jahr' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getJahr();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.baukasten._1.baukasten.TeilbekanntesDatumType#getJahr <em>Jahr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jahr</em>' attribute.
	 * @see #getJahr()
	 * @generated
	 */
	void setJahr(XMLGregorianCalendar value);

} // TeilbekanntesDatumType
