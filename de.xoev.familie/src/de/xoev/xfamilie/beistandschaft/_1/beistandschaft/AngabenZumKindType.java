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
package de.xoev.xfamilie.beistandschaft._1.beistandschaft;

import de.xoev.xfamilie.baukasten._1.baukasten.CodeKindWohnhaftBeiType;
import de.xoev.xfamilie.baukasten._1.baukasten.GeburtType;
import de.xoev.xfamilie.baukasten._1.baukasten.NameNatuerlichePersonOhneGeburtsnameType;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Angaben Zum Kind Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AngabenZumKindType#isKindBereitsGeboren <em>Kind Bereits Geboren</em>}</li>
 *   <li>{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AngabenZumKindType#getVoraussichtlicherEntbindungstermin <em>Voraussichtlicher Entbindungstermin</em>}</li>
 *   <li>{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AngabenZumKindType#getNameDesKindes <em>Name Des Kindes</em>}</li>
 *   <li>{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AngabenZumKindType#getGeburtsdaten <em>Geburtsdaten</em>}</li>
 *   <li>{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AngabenZumKindType#getGeburtenregisternummer <em>Geburtenregisternummer</em>}</li>
 *   <li>{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AngabenZumKindType#getKindWohnhaftBei <em>Kind Wohnhaft Bei</em>}</li>
 *   <li>{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AngabenZumKindType#getKindLebtBeiSonstige <em>Kind Lebt Bei Sonstige</em>}</li>
 *   <li>{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AngabenZumKindType#getAusbildungUndEinkuenfte <em>Ausbildung Und Einkuenfte</em>}</li>
 *   <li>{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AngabenZumKindType#getWeitereKinderImHaushalt <em>Weitere Kinder Im Haushalt</em>}</li>
 *   <li>{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AngabenZumKindType#getWeitereKinder <em>Weitere Kinder</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftPackage#getAngabenZumKindType()
 * @model extendedMetaData="name='AngabenZumKindType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface AngabenZumKindType extends EObject {
	/**
	 * Returns the value of the '<em><b>Kind Bereits Geboren</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind Bereits Geboren</em>' attribute.
	 * @see #isSetKindBereitsGeboren()
	 * @see #unsetKindBereitsGeboren()
	 * @see #setKindBereitsGeboren(boolean)
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftPackage#getAngabenZumKindType_KindBereitsGeboren()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='kindBereitsGeboren' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isKindBereitsGeboren();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AngabenZumKindType#isKindBereitsGeboren <em>Kind Bereits Geboren</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind Bereits Geboren</em>' attribute.
	 * @see #isSetKindBereitsGeboren()
	 * @see #unsetKindBereitsGeboren()
	 * @see #isKindBereitsGeboren()
	 * @generated
	 */
	void setKindBereitsGeboren(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AngabenZumKindType#isKindBereitsGeboren <em>Kind Bereits Geboren</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetKindBereitsGeboren()
	 * @see #isKindBereitsGeboren()
	 * @see #setKindBereitsGeboren(boolean)
	 * @generated
	 */
	void unsetKindBereitsGeboren();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AngabenZumKindType#isKindBereitsGeboren <em>Kind Bereits Geboren</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Kind Bereits Geboren</em>' attribute is set.
	 * @see #unsetKindBereitsGeboren()
	 * @see #isKindBereitsGeboren()
	 * @see #setKindBereitsGeboren(boolean)
	 * @generated
	 */
	boolean isSetKindBereitsGeboren();

	/**
	 * Returns the value of the '<em><b>Voraussichtlicher Entbindungstermin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verpflichtende Angabe, wenn kindBereitsGeboren=false
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Voraussichtlicher Entbindungstermin</em>' attribute.
	 * @see #setVoraussichtlicherEntbindungstermin(XMLGregorianCalendar)
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftPackage#getAngabenZumKindType_VoraussichtlicherEntbindungstermin()
	 * @model dataType="de.xoev.xfamilie.baukasten._1.baukasten.TagesdatumType"
	 *        extendedMetaData="kind='element' name='voraussichtlicherEntbindungstermin' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getVoraussichtlicherEntbindungstermin();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AngabenZumKindType#getVoraussichtlicherEntbindungstermin <em>Voraussichtlicher Entbindungstermin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Voraussichtlicher Entbindungstermin</em>' attribute.
	 * @see #getVoraussichtlicherEntbindungstermin()
	 * @generated
	 */
	void setVoraussichtlicherEntbindungstermin(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Name Des Kindes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name Des Kindes</em>' containment reference.
	 * @see #setNameDesKindes(NameNatuerlichePersonOhneGeburtsnameType)
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftPackage#getAngabenZumKindType_NameDesKindes()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='nameDesKindes' namespace='##targetNamespace'"
	 * @generated
	 */
	NameNatuerlichePersonOhneGeburtsnameType getNameDesKindes();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AngabenZumKindType#getNameDesKindes <em>Name Des Kindes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Des Kindes</em>' containment reference.
	 * @see #getNameDesKindes()
	 * @generated
	 */
	void setNameDesKindes(NameNatuerlichePersonOhneGeburtsnameType value);

	/**
	 * Returns the value of the '<em><b>Geburtsdaten</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Geburtsdaten</em>' containment reference.
	 * @see #setGeburtsdaten(GeburtType)
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftPackage#getAngabenZumKindType_Geburtsdaten()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='geburtsdaten' namespace='##targetNamespace'"
	 * @generated
	 */
	GeburtType getGeburtsdaten();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AngabenZumKindType#getGeburtsdaten <em>Geburtsdaten</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geburtsdaten</em>' containment reference.
	 * @see #getGeburtsdaten()
	 * @generated
	 */
	void setGeburtsdaten(GeburtType value);

	/**
	 * Returns the value of the '<em><b>Geburtenregisternummer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Geburtenregisternummer</em>' attribute.
	 * @see #setGeburtenregisternummer(String)
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftPackage#getAngabenZumKindType_Geburtenregisternummer()
	 * @model dataType="de.xoev.kosit.datentyp._202204.din91379.DatatypeC"
	 *        extendedMetaData="kind='element' name='geburtenregisternummer' namespace='##targetNamespace'"
	 * @generated
	 */
	String getGeburtenregisternummer();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AngabenZumKindType#getGeburtenregisternummer <em>Geburtenregisternummer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geburtenregisternummer</em>' attribute.
	 * @see #getGeburtenregisternummer()
	 * @generated
	 */
	void setGeburtenregisternummer(String value);

	/**
	 * Returns the value of the '<em><b>Kind Wohnhaft Bei</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind Wohnhaft Bei</em>' containment reference.
	 * @see #setKindWohnhaftBei(CodeKindWohnhaftBeiType)
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftPackage#getAngabenZumKindType_KindWohnhaftBei()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='kindWohnhaftBei' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeKindWohnhaftBeiType getKindWohnhaftBei();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AngabenZumKindType#getKindWohnhaftBei <em>Kind Wohnhaft Bei</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind Wohnhaft Bei</em>' containment reference.
	 * @see #getKindWohnhaftBei()
	 * @generated
	 */
	void setKindWohnhaftBei(CodeKindWohnhaftBeiType value);

	/**
	 * Returns the value of the '<em><b>Kind Lebt Bei Sonstige</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Wird zu einer Pflichtangabe, wenn kindLebtBei = Sonstiger Aufenthaltsort.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Kind Lebt Bei Sonstige</em>' attribute.
	 * @see #setKindLebtBeiSonstige(String)
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftPackage#getAngabenZumKindType_KindLebtBeiSonstige()
	 * @model dataType="de.xoev.kosit.datentyp._202204.din91379.DatatypeC"
	 *        extendedMetaData="kind='element' name='kindLebtBeiSonstige' namespace='##targetNamespace'"
	 * @generated
	 */
	String getKindLebtBeiSonstige();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AngabenZumKindType#getKindLebtBeiSonstige <em>Kind Lebt Bei Sonstige</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind Lebt Bei Sonstige</em>' attribute.
	 * @see #getKindLebtBeiSonstige()
	 * @generated
	 */
	void setKindLebtBeiSonstige(String value);

	/**
	 * Returns the value of the '<em><b>Ausbildung Und Einkuenfte</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ausbildung Und Einkuenfte</em>' containment reference.
	 * @see #setAusbildungUndEinkuenfte(AusbildungUndEinkuenfteType)
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftPackage#getAngabenZumKindType_AusbildungUndEinkuenfte()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ausbildungUndEinkuenfte' namespace='##targetNamespace'"
	 * @generated
	 */
	AusbildungUndEinkuenfteType getAusbildungUndEinkuenfte();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AngabenZumKindType#getAusbildungUndEinkuenfte <em>Ausbildung Und Einkuenfte</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ausbildung Und Einkuenfte</em>' containment reference.
	 * @see #getAusbildungUndEinkuenfte()
	 * @generated
	 */
	void setAusbildungUndEinkuenfte(AusbildungUndEinkuenfteType value);

	/**
	 * Returns the value of the '<em><b>Weitere Kinder Im Haushalt</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Boolean}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Weitere Kinder Im Haushalt</em>' attribute list.
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftPackage#getAngabenZumKindType_WeitereKinderImHaushalt()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='weitereKinderImHaushalt' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Boolean> getWeitereKinderImHaushalt();

	/**
	 * Returns the value of the '<em><b>Weitere Kinder</b></em>' containment reference list.
	 * The list contents are of type {@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.WeitereKinderType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Weitere Kinder</em>' containment reference list.
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftPackage#getAngabenZumKindType_WeitereKinder()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='weitereKinder' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<WeitereKinderType> getWeitereKinder();

} // AngabenZumKindType
