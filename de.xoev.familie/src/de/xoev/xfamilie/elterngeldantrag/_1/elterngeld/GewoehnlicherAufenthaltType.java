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

import de.xoev.xfamilie.baukasten._1.baukasten.CodeWohnsitzType;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gewoehnlicher Aufenthalt Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.GewoehnlicherAufenthaltType#getWohnsitz <em>Wohnsitz</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.GewoehnlicherAufenthaltType#getBeginnAufenthaltD <em>Beginn Aufenthalt D</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.GewoehnlicherAufenthaltType#getBefristeterAuslandsaufenthalt <em>Befristeter Auslandsaufenthalt</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.GewoehnlicherAufenthaltType#getUnbefristeterAuslandsaufenthalt <em>Unbefristeter Auslandsaufenthalt</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.GewoehnlicherAufenthaltType#getAuslaendischesArbeitsverhaeltnis <em>Auslaendisches Arbeitsverhaeltnis</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.GewoehnlicherAufenthaltType#isMitgliedNatoZivilesGefolge <em>Mitglied Nato Ziviles Gefolge</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.GewoehnlicherAufenthaltType#isMitgliedDiplomatischeMissionOderKonsularischeVertretung <em>Mitglied Diplomatische Mission Oder Konsularische Vertretung</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getGewoehnlicherAufenthaltType()
 * @model extendedMetaData="name='GewoehnlicherAufenthaltType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface GewoehnlicherAufenthaltType extends EObject {
	/**
	 * Returns the value of the '<em><b>Wohnsitz</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wohnsitz</em>' containment reference.
	 * @see #setWohnsitz(CodeWohnsitzType)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getGewoehnlicherAufenthaltType_Wohnsitz()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='wohnsitz' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeWohnsitzType getWohnsitz();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.GewoehnlicherAufenthaltType#getWohnsitz <em>Wohnsitz</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wohnsitz</em>' containment reference.
	 * @see #getWohnsitz()
	 * @generated
	 */
	void setWohnsitz(CodeWohnsitzType value);

	/**
	 * Returns the value of the '<em><b>Beginn Aufenthalt D</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Beginn Aufenthalt D</em>' attribute.
	 * @see #setBeginnAufenthaltD(XMLGregorianCalendar)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getGewoehnlicherAufenthaltType_BeginnAufenthaltD()
	 * @model dataType="de.xoev.xfamilie.baukasten._1.baukasten.TagesdatumType"
	 *        extendedMetaData="kind='element' name='beginnAufenthaltD' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getBeginnAufenthaltD();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.GewoehnlicherAufenthaltType#getBeginnAufenthaltD <em>Beginn Aufenthalt D</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Beginn Aufenthalt D</em>' attribute.
	 * @see #getBeginnAufenthaltD()
	 * @generated
	 */
	void setBeginnAufenthaltD(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Befristeter Auslandsaufenthalt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Befristeter Auslandsaufenthalt</em>' containment reference.
	 * @see #setBefristeterAuslandsaufenthalt(AuslandsaufenthaltBefrType)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getGewoehnlicherAufenthaltType_BefristeterAuslandsaufenthalt()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='befristeterAuslandsaufenthalt' namespace='##targetNamespace'"
	 * @generated
	 */
	AuslandsaufenthaltBefrType getBefristeterAuslandsaufenthalt();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.GewoehnlicherAufenthaltType#getBefristeterAuslandsaufenthalt <em>Befristeter Auslandsaufenthalt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Befristeter Auslandsaufenthalt</em>' containment reference.
	 * @see #getBefristeterAuslandsaufenthalt()
	 * @generated
	 */
	void setBefristeterAuslandsaufenthalt(AuslandsaufenthaltBefrType value);

	/**
	 * Returns the value of the '<em><b>Unbefristeter Auslandsaufenthalt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unbefristeter Auslandsaufenthalt</em>' containment reference.
	 * @see #setUnbefristeterAuslandsaufenthalt(AuslandsaufenthaltType)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getGewoehnlicherAufenthaltType_UnbefristeterAuslandsaufenthalt()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='unbefristeterAuslandsaufenthalt' namespace='##targetNamespace'"
	 * @generated
	 */
	AuslandsaufenthaltType getUnbefristeterAuslandsaufenthalt();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.GewoehnlicherAufenthaltType#getUnbefristeterAuslandsaufenthalt <em>Unbefristeter Auslandsaufenthalt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unbefristeter Auslandsaufenthalt</em>' containment reference.
	 * @see #getUnbefristeterAuslandsaufenthalt()
	 * @generated
	 */
	void setUnbefristeterAuslandsaufenthalt(AuslandsaufenthaltType value);

	/**
	 * Returns the value of the '<em><b>Auslaendisches Arbeitsverhaeltnis</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auslaendisches Arbeitsverhaeltnis</em>' containment reference.
	 * @see #setAuslaendischesArbeitsverhaeltnis(AuslaendischesArbeitsverhaeltnisType)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getGewoehnlicherAufenthaltType_AuslaendischesArbeitsverhaeltnis()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='auslaendischesArbeitsverhaeltnis' namespace='##targetNamespace'"
	 * @generated
	 */
	AuslaendischesArbeitsverhaeltnisType getAuslaendischesArbeitsverhaeltnis();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.GewoehnlicherAufenthaltType#getAuslaendischesArbeitsverhaeltnis <em>Auslaendisches Arbeitsverhaeltnis</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auslaendisches Arbeitsverhaeltnis</em>' containment reference.
	 * @see #getAuslaendischesArbeitsverhaeltnis()
	 * @generated
	 */
	void setAuslaendischesArbeitsverhaeltnis(AuslaendischesArbeitsverhaeltnisType value);

	/**
	 * Returns the value of the '<em><b>Mitglied Nato Ziviles Gefolge</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mitglied Nato Ziviles Gefolge</em>' attribute.
	 * @see #isSetMitgliedNatoZivilesGefolge()
	 * @see #unsetMitgliedNatoZivilesGefolge()
	 * @see #setMitgliedNatoZivilesGefolge(boolean)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getGewoehnlicherAufenthaltType_MitgliedNatoZivilesGefolge()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='mitgliedNatoZivilesGefolge' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isMitgliedNatoZivilesGefolge();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.GewoehnlicherAufenthaltType#isMitgliedNatoZivilesGefolge <em>Mitglied Nato Ziviles Gefolge</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mitglied Nato Ziviles Gefolge</em>' attribute.
	 * @see #isSetMitgliedNatoZivilesGefolge()
	 * @see #unsetMitgliedNatoZivilesGefolge()
	 * @see #isMitgliedNatoZivilesGefolge()
	 * @generated
	 */
	void setMitgliedNatoZivilesGefolge(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.GewoehnlicherAufenthaltType#isMitgliedNatoZivilesGefolge <em>Mitglied Nato Ziviles Gefolge</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMitgliedNatoZivilesGefolge()
	 * @see #isMitgliedNatoZivilesGefolge()
	 * @see #setMitgliedNatoZivilesGefolge(boolean)
	 * @generated
	 */
	void unsetMitgliedNatoZivilesGefolge();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.GewoehnlicherAufenthaltType#isMitgliedNatoZivilesGefolge <em>Mitglied Nato Ziviles Gefolge</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Mitglied Nato Ziviles Gefolge</em>' attribute is set.
	 * @see #unsetMitgliedNatoZivilesGefolge()
	 * @see #isMitgliedNatoZivilesGefolge()
	 * @see #setMitgliedNatoZivilesGefolge(boolean)
	 * @generated
	 */
	boolean isSetMitgliedNatoZivilesGefolge();

	/**
	 * Returns the value of the '<em><b>Mitglied Diplomatische Mission Oder Konsularische Vertretung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mitglied Diplomatische Mission Oder Konsularische Vertretung</em>' attribute.
	 * @see #isSetMitgliedDiplomatischeMissionOderKonsularischeVertretung()
	 * @see #unsetMitgliedDiplomatischeMissionOderKonsularischeVertretung()
	 * @see #setMitgliedDiplomatischeMissionOderKonsularischeVertretung(boolean)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getGewoehnlicherAufenthaltType_MitgliedDiplomatischeMissionOderKonsularischeVertretung()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='mitgliedDiplomatischeMissionOderKonsularischeVertretung' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isMitgliedDiplomatischeMissionOderKonsularischeVertretung();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.GewoehnlicherAufenthaltType#isMitgliedDiplomatischeMissionOderKonsularischeVertretung <em>Mitglied Diplomatische Mission Oder Konsularische Vertretung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mitglied Diplomatische Mission Oder Konsularische Vertretung</em>' attribute.
	 * @see #isSetMitgliedDiplomatischeMissionOderKonsularischeVertretung()
	 * @see #unsetMitgliedDiplomatischeMissionOderKonsularischeVertretung()
	 * @see #isMitgliedDiplomatischeMissionOderKonsularischeVertretung()
	 * @generated
	 */
	void setMitgliedDiplomatischeMissionOderKonsularischeVertretung(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.GewoehnlicherAufenthaltType#isMitgliedDiplomatischeMissionOderKonsularischeVertretung <em>Mitglied Diplomatische Mission Oder Konsularische Vertretung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMitgliedDiplomatischeMissionOderKonsularischeVertretung()
	 * @see #isMitgliedDiplomatischeMissionOderKonsularischeVertretung()
	 * @see #setMitgliedDiplomatischeMissionOderKonsularischeVertretung(boolean)
	 * @generated
	 */
	void unsetMitgliedDiplomatischeMissionOderKonsularischeVertretung();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.GewoehnlicherAufenthaltType#isMitgliedDiplomatischeMissionOderKonsularischeVertretung <em>Mitglied Diplomatische Mission Oder Konsularische Vertretung</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Mitglied Diplomatische Mission Oder Konsularische Vertretung</em>' attribute is set.
	 * @see #unsetMitgliedDiplomatischeMissionOderKonsularischeVertretung()
	 * @see #isMitgliedDiplomatischeMissionOderKonsularischeVertretung()
	 * @see #setMitgliedDiplomatischeMissionOderKonsularischeVertretung(boolean)
	 * @generated
	 */
	boolean isSetMitgliedDiplomatischeMissionOderKonsularischeVertretung();

} // GewoehnlicherAufenthaltType
