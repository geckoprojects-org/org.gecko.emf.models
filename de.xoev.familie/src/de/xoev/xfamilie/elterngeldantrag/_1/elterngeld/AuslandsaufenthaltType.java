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
package de.xoev.xfamilie.elterngeldantrag._1.elterngeld;

import de.xoev.xfamilie.baukasten._1.baukasten.CodeStaatType;
import de.xoev.xfamilie.baukasten._1.baukasten.NachweisdokumentType;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Auslandsaufenthalt Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AuslandsaufenthaltType#getGrundDesAufenthalts <em>Grund Des Aufenthalts</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AuslandsaufenthaltType#getAufenthaltsland <em>Aufenthaltsland</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AuslandsaufenthaltType#getNachweisAuslandsaufenthalt <em>Nachweis Auslandsaufenthalt</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AuslandsaufenthaltType#isInlaendischesArbeitsverhaeltnis <em>Inlaendisches Arbeitsverhaeltnis</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AuslandsaufenthaltType#getPlzArbeitgeber <em>Plz Arbeitgeber</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AuslandsaufenthaltType#getOrtArbeitgeber <em>Ort Arbeitgeber</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AuslandsaufenthaltType#getBeginnAufenthalt <em>Beginn Aufenthalt</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getAuslandsaufenthaltType()
 * @model extendedMetaData="name='AuslandsaufenthaltType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface AuslandsaufenthaltType extends EObject {
	/**
	 * Returns the value of the '<em><b>Grund Des Aufenthalts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grund Des Aufenthalts</em>' attribute.
	 * @see #setGrundDesAufenthalts(String)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getAuslandsaufenthaltType_GrundDesAufenthalts()
	 * @model dataType="de.xoev.kosit.datentyp._202204.din91379.DatatypeC" required="true"
	 *        extendedMetaData="kind='element' name='grundDesAufenthalts' namespace='##targetNamespace'"
	 * @generated
	 */
	String getGrundDesAufenthalts();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AuslandsaufenthaltType#getGrundDesAufenthalts <em>Grund Des Aufenthalts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grund Des Aufenthalts</em>' attribute.
	 * @see #getGrundDesAufenthalts()
	 * @generated
	 */
	void setGrundDesAufenthalts(String value);

	/**
	 * Returns the value of the '<em><b>Aufenthaltsland</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aufenthaltsland</em>' containment reference.
	 * @see #setAufenthaltsland(CodeStaatType)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getAuslandsaufenthaltType_Aufenthaltsland()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='aufenthaltsland' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeStaatType getAufenthaltsland();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AuslandsaufenthaltType#getAufenthaltsland <em>Aufenthaltsland</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aufenthaltsland</em>' containment reference.
	 * @see #getAufenthaltsland()
	 * @generated
	 */
	void setAufenthaltsland(CodeStaatType value);

	/**
	 * Returns the value of the '<em><b>Nachweis Auslandsaufenthalt</b></em>' containment reference list.
	 * The list contents are of type {@link de.xoev.xfamilie.baukasten._1.baukasten.NachweisdokumentType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Von den Antragstellenden im Antragsservice bereitgestellte Nachweisdokumente (hochgeladene Fotos, Scans, etc.). Siehe auch .
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nachweis Auslandsaufenthalt</em>' containment reference list.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getAuslandsaufenthaltType_NachweisAuslandsaufenthalt()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='nachweisAuslandsaufenthalt' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<NachweisdokumentType> getNachweisAuslandsaufenthalt();

	/**
	 * Returns the value of the '<em><b>Inlaendisches Arbeitsverhaeltnis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inlaendisches Arbeitsverhaeltnis</em>' attribute.
	 * @see #isSetInlaendischesArbeitsverhaeltnis()
	 * @see #unsetInlaendischesArbeitsverhaeltnis()
	 * @see #setInlaendischesArbeitsverhaeltnis(boolean)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getAuslandsaufenthaltType_InlaendischesArbeitsverhaeltnis()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='inlaendischesArbeitsverhaeltnis' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isInlaendischesArbeitsverhaeltnis();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AuslandsaufenthaltType#isInlaendischesArbeitsverhaeltnis <em>Inlaendisches Arbeitsverhaeltnis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inlaendisches Arbeitsverhaeltnis</em>' attribute.
	 * @see #isSetInlaendischesArbeitsverhaeltnis()
	 * @see #unsetInlaendischesArbeitsverhaeltnis()
	 * @see #isInlaendischesArbeitsverhaeltnis()
	 * @generated
	 */
	void setInlaendischesArbeitsverhaeltnis(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AuslandsaufenthaltType#isInlaendischesArbeitsverhaeltnis <em>Inlaendisches Arbeitsverhaeltnis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetInlaendischesArbeitsverhaeltnis()
	 * @see #isInlaendischesArbeitsverhaeltnis()
	 * @see #setInlaendischesArbeitsverhaeltnis(boolean)
	 * @generated
	 */
	void unsetInlaendischesArbeitsverhaeltnis();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AuslandsaufenthaltType#isInlaendischesArbeitsverhaeltnis <em>Inlaendisches Arbeitsverhaeltnis</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Inlaendisches Arbeitsverhaeltnis</em>' attribute is set.
	 * @see #unsetInlaendischesArbeitsverhaeltnis()
	 * @see #isInlaendischesArbeitsverhaeltnis()
	 * @see #setInlaendischesArbeitsverhaeltnis(boolean)
	 * @generated
	 */
	boolean isSetInlaendischesArbeitsverhaeltnis();

	/**
	 * Returns the value of the '<em><b>Plz Arbeitgeber</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plz Arbeitgeber</em>' attribute.
	 * @see #setPlzArbeitgeber(String)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getAuslandsaufenthaltType_PlzArbeitgeber()
	 * @model dataType="de.xoev.kosit.datentyp._202204.din91379.DatatypeC"
	 *        extendedMetaData="kind='element' name='plzArbeitgeber' namespace='##targetNamespace'"
	 * @generated
	 */
	String getPlzArbeitgeber();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AuslandsaufenthaltType#getPlzArbeitgeber <em>Plz Arbeitgeber</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plz Arbeitgeber</em>' attribute.
	 * @see #getPlzArbeitgeber()
	 * @generated
	 */
	void setPlzArbeitgeber(String value);

	/**
	 * Returns the value of the '<em><b>Ort Arbeitgeber</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ort Arbeitgeber</em>' attribute.
	 * @see #setOrtArbeitgeber(String)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getAuslandsaufenthaltType_OrtArbeitgeber()
	 * @model dataType="de.xoev.kosit.datentyp._202204.din91379.DatatypeC"
	 *        extendedMetaData="kind='element' name='ortArbeitgeber' namespace='##targetNamespace'"
	 * @generated
	 */
	String getOrtArbeitgeber();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AuslandsaufenthaltType#getOrtArbeitgeber <em>Ort Arbeitgeber</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ort Arbeitgeber</em>' attribute.
	 * @see #getOrtArbeitgeber()
	 * @generated
	 */
	void setOrtArbeitgeber(String value);

	/**
	 * Returns the value of the '<em><b>Beginn Aufenthalt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Beginn Aufenthalt</em>' attribute.
	 * @see #setBeginnAufenthalt(XMLGregorianCalendar)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getAuslandsaufenthaltType_BeginnAufenthalt()
	 * @model dataType="de.xoev.xfamilie.baukasten._1.baukasten.TagesdatumType" required="true"
	 *        extendedMetaData="kind='element' name='beginnAufenthalt' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getBeginnAufenthalt();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AuslandsaufenthaltType#getBeginnAufenthalt <em>Beginn Aufenthalt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Beginn Aufenthalt</em>' attribute.
	 * @see #getBeginnAufenthalt()
	 * @generated
	 */
	void setBeginnAufenthalt(XMLGregorianCalendar value);

} // AuslandsaufenthaltType
