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
package de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld;

import java.math.BigDecimal;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Angaben Mutterschaftsgeld Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.AngabenMutterschaftsgeldType#getMutterschaftsgeldzahlungAb <em>Mutterschaftsgeldzahlung Ab</em>}</li>
 *   <li>{@link de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.AngabenMutterschaftsgeldType#getMutterschaftsgeldzahlungBis <em>Mutterschaftsgeldzahlung Bis</em>}</li>
 *   <li>{@link de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.AngabenMutterschaftsgeldType#getMutterschaftsgeldzahlungHoehe <em>Mutterschaftsgeldzahlung Hoehe</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.MutterschaftsgeldPackage#getAngabenMutterschaftsgeldType()
 * @model extendedMetaData="name='angabenMutterschaftsgeld_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface AngabenMutterschaftsgeldType extends EObject {
	/**
	 * Returns the value of the '<em><b>Mutterschaftsgeldzahlung Ab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Beginn der Mutterschaftsgeldzahlung von der Krankenkasse.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mutterschaftsgeldzahlung Ab</em>' attribute.
	 * @see #setMutterschaftsgeldzahlungAb(XMLGregorianCalendar)
	 * @see de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.MutterschaftsgeldPackage#getAngabenMutterschaftsgeldType_MutterschaftsgeldzahlungAb()
	 * @model dataType="de.xoev.xfamilie.baukasten._1.baukasten.TagesdatumType" required="true"
	 *        extendedMetaData="kind='element' name='mutterschaftsgeldzahlungAb' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getMutterschaftsgeldzahlungAb();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.AngabenMutterschaftsgeldType#getMutterschaftsgeldzahlungAb <em>Mutterschaftsgeldzahlung Ab</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mutterschaftsgeldzahlung Ab</em>' attribute.
	 * @see #getMutterschaftsgeldzahlungAb()
	 * @generated
	 */
	void setMutterschaftsgeldzahlungAb(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Mutterschaftsgeldzahlung Bis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ende der Mutterschaftsgeldzahlung von der Krankenkasse.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mutterschaftsgeldzahlung Bis</em>' attribute.
	 * @see #setMutterschaftsgeldzahlungBis(XMLGregorianCalendar)
	 * @see de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.MutterschaftsgeldPackage#getAngabenMutterschaftsgeldType_MutterschaftsgeldzahlungBis()
	 * @model dataType="de.xoev.xfamilie.baukasten._1.baukasten.TagesdatumType"
	 *        extendedMetaData="kind='element' name='mutterschaftsgeldzahlungBis' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getMutterschaftsgeldzahlungBis();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.AngabenMutterschaftsgeldType#getMutterschaftsgeldzahlungBis <em>Mutterschaftsgeldzahlung Bis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mutterschaftsgeldzahlung Bis</em>' attribute.
	 * @see #getMutterschaftsgeldzahlungBis()
	 * @generated
	 */
	void setMutterschaftsgeldzahlungBis(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Mutterschaftsgeldzahlung Hoehe</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Höhe des bewilligten grundsätzlich zustehenden kalendertäglichen Anspruchs auf Mutterschaftsgeld von der Krankenkasse ohne Berücksichtigung von Ruhens- und Kürzungstatbeständen. Der Betrag ist mit zwei Nachkommastellen anzugeben.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mutterschaftsgeldzahlung Hoehe</em>' attribute.
	 * @see #setMutterschaftsgeldzahlungHoehe(BigDecimal)
	 * @see de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.MutterschaftsgeldPackage#getAngabenMutterschaftsgeldType_MutterschaftsgeldzahlungHoehe()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Decimal"
	 *        extendedMetaData="kind='element' name='mutterschaftsgeldzahlungHoehe' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getMutterschaftsgeldzahlungHoehe();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.AngabenMutterschaftsgeldType#getMutterschaftsgeldzahlungHoehe <em>Mutterschaftsgeldzahlung Hoehe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mutterschaftsgeldzahlung Hoehe</em>' attribute.
	 * @see #getMutterschaftsgeldzahlungHoehe()
	 * @generated
	 */
	void setMutterschaftsgeldzahlungHoehe(BigDecimal value);

} // AngabenMutterschaftsgeldType
