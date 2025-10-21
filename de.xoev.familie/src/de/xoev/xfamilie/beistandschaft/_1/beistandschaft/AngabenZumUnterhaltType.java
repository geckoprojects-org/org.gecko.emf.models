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

import de.xoev.xfamilie.baukasten._1.baukasten.BankverbindungType;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Angaben Zum Unterhalt Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Angaben zum Unterhalt.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AngabenZumUnterhaltType#getAngabenZumUnterhaltstitel <em>Angaben Zum Unterhaltstitel</em>}</li>
 *   <li>{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AngabenZumUnterhaltType#isBemuehungUnterhaltszahlung <em>Bemuehung Unterhaltszahlung</em>}</li>
 *   <li>{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AngabenZumUnterhaltType#getBisherigeBemuehungen <em>Bisherige Bemuehungen</em>}</li>
 *   <li>{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AngabenZumUnterhaltType#isZahltBereits <em>Zahlt Bereits</em>}</li>
 *   <li>{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AngabenZumUnterhaltType#getHoeheZahlung <em>Hoehe Zahlung</em>}</li>
 *   <li>{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AngabenZumUnterhaltType#getLetzteZahlungAm <em>Letzte Zahlung Am</em>}</li>
 *   <li>{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AngabenZumUnterhaltType#isRegelmaessigeZahlung <em>Regelmaessige Zahlung</em>}</li>
 *   <li>{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AngabenZumUnterhaltType#getAngabenZurZahlung <em>Angaben Zur Zahlung</em>}</li>
 *   <li>{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AngabenZumUnterhaltType#isGeltendmachungUnterhaltsrueckstaende <em>Geltendmachung Unterhaltsrueckstaende</em>}</li>
 *   <li>{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AngabenZumUnterhaltType#getAngabeUnterhaltsrueckstaende <em>Angabe Unterhaltsrueckstaende</em>}</li>
 *   <li>{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AngabenZumUnterhaltType#isFreiwilligerVerzichtAufUnterhalt <em>Freiwilliger Verzicht Auf Unterhalt</em>}</li>
 *   <li>{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AngabenZumUnterhaltType#getUnterhaltVerzichtZeitraum <em>Unterhalt Verzicht Zeitraum</em>}</li>
 *   <li>{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AngabenZumUnterhaltType#getZahlung <em>Zahlung</em>}</li>
 *   <li>{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AngabenZumUnterhaltType#getBankverbindungZahlungJugendamt <em>Bankverbindung Zahlung Jugendamt</em>}</li>
 *   <li>{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AngabenZumUnterhaltType#getBankverbindungDirektzahlung <em>Bankverbindung Direktzahlung</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftPackage#getAngabenZumUnterhaltType()
 * @model extendedMetaData="name='AngabenZumUnterhaltType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface AngabenZumUnterhaltType extends EObject {
	/**
	 * Returns the value of the '<em><b>Angaben Zum Unterhaltstitel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angabe, ob ein Unterhaltstitel besteht.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Angaben Zum Unterhaltstitel</em>' containment reference.
	 * @see #setAngabenZumUnterhaltstitel(CodeUnterhaltstitelBestehtType)
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftPackage#getAngabenZumUnterhaltType_AngabenZumUnterhaltstitel()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='angabenZumUnterhaltstitel' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeUnterhaltstitelBestehtType getAngabenZumUnterhaltstitel();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AngabenZumUnterhaltType#getAngabenZumUnterhaltstitel <em>Angaben Zum Unterhaltstitel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Angaben Zum Unterhaltstitel</em>' containment reference.
	 * @see #getAngabenZumUnterhaltstitel()
	 * @generated
	 */
	void setAngabenZumUnterhaltstitel(CodeUnterhaltstitelBestehtType value);

	/**
	 * Returns the value of the '<em><b>Bemuehung Unterhaltszahlung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angabe, ob Bemühungen bzgl. Unterhalt erfolgten.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bemuehung Unterhaltszahlung</em>' attribute.
	 * @see #isSetBemuehungUnterhaltszahlung()
	 * @see #unsetBemuehungUnterhaltszahlung()
	 * @see #setBemuehungUnterhaltszahlung(boolean)
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftPackage#getAngabenZumUnterhaltType_BemuehungUnterhaltszahlung()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='bemuehungUnterhaltszahlung' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isBemuehungUnterhaltszahlung();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AngabenZumUnterhaltType#isBemuehungUnterhaltszahlung <em>Bemuehung Unterhaltszahlung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bemuehung Unterhaltszahlung</em>' attribute.
	 * @see #isSetBemuehungUnterhaltszahlung()
	 * @see #unsetBemuehungUnterhaltszahlung()
	 * @see #isBemuehungUnterhaltszahlung()
	 * @generated
	 */
	void setBemuehungUnterhaltszahlung(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AngabenZumUnterhaltType#isBemuehungUnterhaltszahlung <em>Bemuehung Unterhaltszahlung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBemuehungUnterhaltszahlung()
	 * @see #isBemuehungUnterhaltszahlung()
	 * @see #setBemuehungUnterhaltszahlung(boolean)
	 * @generated
	 */
	void unsetBemuehungUnterhaltszahlung();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AngabenZumUnterhaltType#isBemuehungUnterhaltszahlung <em>Bemuehung Unterhaltszahlung</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Bemuehung Unterhaltszahlung</em>' attribute is set.
	 * @see #unsetBemuehungUnterhaltszahlung()
	 * @see #isBemuehungUnterhaltszahlung()
	 * @see #setBemuehungUnterhaltszahlung(boolean)
	 * @generated
	 */
	boolean isSetBemuehungUnterhaltszahlung();

	/**
	 * Returns the value of the '<em><b>Bisherige Bemuehungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angabe, in welcher Form die bisherigen Bemühungen stattfanden.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bisherige Bemuehungen</em>' attribute.
	 * @see #setBisherigeBemuehungen(String)
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftPackage#getAngabenZumUnterhaltType_BisherigeBemuehungen()
	 * @model dataType="de.xoev.kosit.datentyp._202204.din91379.DatatypeC"
	 *        extendedMetaData="kind='element' name='bisherigeBemuehungen' namespace='##targetNamespace'"
	 * @generated
	 */
	String getBisherigeBemuehungen();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AngabenZumUnterhaltType#getBisherigeBemuehungen <em>Bisherige Bemuehungen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bisherige Bemuehungen</em>' attribute.
	 * @see #getBisherigeBemuehungen()
	 * @generated
	 */
	void setBisherigeBemuehungen(String value);

	/**
	 * Returns the value of the '<em><b>Zahlt Bereits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angabe, ob der Unterhalt bereits gezahlt wird.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Zahlt Bereits</em>' attribute.
	 * @see #isSetZahltBereits()
	 * @see #unsetZahltBereits()
	 * @see #setZahltBereits(boolean)
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftPackage#getAngabenZumUnterhaltType_ZahltBereits()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='zahltBereits' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isZahltBereits();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AngabenZumUnterhaltType#isZahltBereits <em>Zahlt Bereits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zahlt Bereits</em>' attribute.
	 * @see #isSetZahltBereits()
	 * @see #unsetZahltBereits()
	 * @see #isZahltBereits()
	 * @generated
	 */
	void setZahltBereits(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AngabenZumUnterhaltType#isZahltBereits <em>Zahlt Bereits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetZahltBereits()
	 * @see #isZahltBereits()
	 * @see #setZahltBereits(boolean)
	 * @generated
	 */
	void unsetZahltBereits();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AngabenZumUnterhaltType#isZahltBereits <em>Zahlt Bereits</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Zahlt Bereits</em>' attribute is set.
	 * @see #unsetZahltBereits()
	 * @see #isZahltBereits()
	 * @see #setZahltBereits(boolean)
	 * @generated
	 */
	boolean isSetZahltBereits();

	/**
	 * Returns the value of the '<em><b>Hoehe Zahlung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angabe, in welcher Höhe der Unterhalt gezahlt wurde.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hoehe Zahlung</em>' attribute.
	 * @see #isSetHoeheZahlung()
	 * @see #unsetHoeheZahlung()
	 * @see #setHoeheZahlung(float)
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftPackage#getAngabenZumUnterhaltType_HoeheZahlung()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Float"
	 *        extendedMetaData="kind='element' name='hoeheZahlung' namespace='##targetNamespace'"
	 * @generated
	 */
	float getHoeheZahlung();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AngabenZumUnterhaltType#getHoeheZahlung <em>Hoehe Zahlung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hoehe Zahlung</em>' attribute.
	 * @see #isSetHoeheZahlung()
	 * @see #unsetHoeheZahlung()
	 * @see #getHoeheZahlung()
	 * @generated
	 */
	void setHoeheZahlung(float value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AngabenZumUnterhaltType#getHoeheZahlung <em>Hoehe Zahlung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetHoeheZahlung()
	 * @see #getHoeheZahlung()
	 * @see #setHoeheZahlung(float)
	 * @generated
	 */
	void unsetHoeheZahlung();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AngabenZumUnterhaltType#getHoeheZahlung <em>Hoehe Zahlung</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Hoehe Zahlung</em>' attribute is set.
	 * @see #unsetHoeheZahlung()
	 * @see #getHoeheZahlung()
	 * @see #setHoeheZahlung(float)
	 * @generated
	 */
	boolean isSetHoeheZahlung();

	/**
	 * Returns the value of the '<em><b>Letzte Zahlung Am</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angabe, an welchem Tag die letzte Zahlung erfolgte.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Letzte Zahlung Am</em>' attribute.
	 * @see #setLetzteZahlungAm(XMLGregorianCalendar)
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftPackage#getAngabenZumUnterhaltType_LetzteZahlungAm()
	 * @model dataType="de.xoev.xfamilie.baukasten._1.baukasten.TagesdatumType"
	 *        extendedMetaData="kind='element' name='letzteZahlungAm' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getLetzteZahlungAm();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AngabenZumUnterhaltType#getLetzteZahlungAm <em>Letzte Zahlung Am</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Letzte Zahlung Am</em>' attribute.
	 * @see #getLetzteZahlungAm()
	 * @generated
	 */
	void setLetzteZahlungAm(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Regelmaessige Zahlung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angabe, ob regelmäßig eine Unterhaltszahlung stattfindet.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Regelmaessige Zahlung</em>' attribute.
	 * @see #isSetRegelmaessigeZahlung()
	 * @see #unsetRegelmaessigeZahlung()
	 * @see #setRegelmaessigeZahlung(boolean)
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftPackage#getAngabenZumUnterhaltType_RegelmaessigeZahlung()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='regelmaessigeZahlung' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isRegelmaessigeZahlung();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AngabenZumUnterhaltType#isRegelmaessigeZahlung <em>Regelmaessige Zahlung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Regelmaessige Zahlung</em>' attribute.
	 * @see #isSetRegelmaessigeZahlung()
	 * @see #unsetRegelmaessigeZahlung()
	 * @see #isRegelmaessigeZahlung()
	 * @generated
	 */
	void setRegelmaessigeZahlung(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AngabenZumUnterhaltType#isRegelmaessigeZahlung <em>Regelmaessige Zahlung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRegelmaessigeZahlung()
	 * @see #isRegelmaessigeZahlung()
	 * @see #setRegelmaessigeZahlung(boolean)
	 * @generated
	 */
	void unsetRegelmaessigeZahlung();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AngabenZumUnterhaltType#isRegelmaessigeZahlung <em>Regelmaessige Zahlung</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Regelmaessige Zahlung</em>' attribute is set.
	 * @see #unsetRegelmaessigeZahlung()
	 * @see #isRegelmaessigeZahlung()
	 * @see #setRegelmaessigeZahlung(boolean)
	 * @generated
	 */
	boolean isSetRegelmaessigeZahlung();

	/**
	 * Returns the value of the '<em><b>Angaben Zur Zahlung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Weitere Angaben zur Zahlung.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Angaben Zur Zahlung</em>' attribute.
	 * @see #setAngabenZurZahlung(String)
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftPackage#getAngabenZumUnterhaltType_AngabenZurZahlung()
	 * @model dataType="de.xoev.kosit.datentyp._202204.din91379.DatatypeC"
	 *        extendedMetaData="kind='element' name='angabenZurZahlung' namespace='##targetNamespace'"
	 * @generated
	 */
	String getAngabenZurZahlung();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AngabenZumUnterhaltType#getAngabenZurZahlung <em>Angaben Zur Zahlung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Angaben Zur Zahlung</em>' attribute.
	 * @see #getAngabenZurZahlung()
	 * @generated
	 */
	void setAngabenZurZahlung(String value);

	/**
	 * Returns the value of the '<em><b>Geltendmachung Unterhaltsrueckstaende</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angabe, ob Unterhaltsrückstände geltend gemacht wurden.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Geltendmachung Unterhaltsrueckstaende</em>' attribute.
	 * @see #isSetGeltendmachungUnterhaltsrueckstaende()
	 * @see #unsetGeltendmachungUnterhaltsrueckstaende()
	 * @see #setGeltendmachungUnterhaltsrueckstaende(boolean)
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftPackage#getAngabenZumUnterhaltType_GeltendmachungUnterhaltsrueckstaende()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='geltendmachungUnterhaltsrueckstaende' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isGeltendmachungUnterhaltsrueckstaende();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AngabenZumUnterhaltType#isGeltendmachungUnterhaltsrueckstaende <em>Geltendmachung Unterhaltsrueckstaende</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geltendmachung Unterhaltsrueckstaende</em>' attribute.
	 * @see #isSetGeltendmachungUnterhaltsrueckstaende()
	 * @see #unsetGeltendmachungUnterhaltsrueckstaende()
	 * @see #isGeltendmachungUnterhaltsrueckstaende()
	 * @generated
	 */
	void setGeltendmachungUnterhaltsrueckstaende(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AngabenZumUnterhaltType#isGeltendmachungUnterhaltsrueckstaende <em>Geltendmachung Unterhaltsrueckstaende</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetGeltendmachungUnterhaltsrueckstaende()
	 * @see #isGeltendmachungUnterhaltsrueckstaende()
	 * @see #setGeltendmachungUnterhaltsrueckstaende(boolean)
	 * @generated
	 */
	void unsetGeltendmachungUnterhaltsrueckstaende();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AngabenZumUnterhaltType#isGeltendmachungUnterhaltsrueckstaende <em>Geltendmachung Unterhaltsrueckstaende</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Geltendmachung Unterhaltsrueckstaende</em>' attribute is set.
	 * @see #unsetGeltendmachungUnterhaltsrueckstaende()
	 * @see #isGeltendmachungUnterhaltsrueckstaende()
	 * @see #setGeltendmachungUnterhaltsrueckstaende(boolean)
	 * @generated
	 */
	boolean isSetGeltendmachungUnterhaltsrueckstaende();

	/**
	 * Returns the value of the '<em><b>Angabe Unterhaltsrueckstaende</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angabe, in welcher Höhe die Unterhaltsrückstände geltend gemacht wurden.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Angabe Unterhaltsrueckstaende</em>' attribute.
	 * @see #setAngabeUnterhaltsrueckstaende(String)
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftPackage#getAngabenZumUnterhaltType_AngabeUnterhaltsrueckstaende()
	 * @model dataType="de.xoev.kosit.datentyp._202204.din91379.DatatypeC"
	 *        extendedMetaData="kind='element' name='angabeUnterhaltsrueckstaende' namespace='##targetNamespace'"
	 * @generated
	 */
	String getAngabeUnterhaltsrueckstaende();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AngabenZumUnterhaltType#getAngabeUnterhaltsrueckstaende <em>Angabe Unterhaltsrueckstaende</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Angabe Unterhaltsrueckstaende</em>' attribute.
	 * @see #getAngabeUnterhaltsrueckstaende()
	 * @generated
	 */
	void setAngabeUnterhaltsrueckstaende(String value);

	/**
	 * Returns the value of the '<em><b>Freiwilliger Verzicht Auf Unterhalt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angabe, ob ein freiwilliger Verzicht auf Unterhalt stattfindet.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Freiwilliger Verzicht Auf Unterhalt</em>' attribute.
	 * @see #isSetFreiwilligerVerzichtAufUnterhalt()
	 * @see #unsetFreiwilligerVerzichtAufUnterhalt()
	 * @see #setFreiwilligerVerzichtAufUnterhalt(boolean)
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftPackage#getAngabenZumUnterhaltType_FreiwilligerVerzichtAufUnterhalt()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='freiwilligerVerzichtAufUnterhalt' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isFreiwilligerVerzichtAufUnterhalt();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AngabenZumUnterhaltType#isFreiwilligerVerzichtAufUnterhalt <em>Freiwilliger Verzicht Auf Unterhalt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Freiwilliger Verzicht Auf Unterhalt</em>' attribute.
	 * @see #isSetFreiwilligerVerzichtAufUnterhalt()
	 * @see #unsetFreiwilligerVerzichtAufUnterhalt()
	 * @see #isFreiwilligerVerzichtAufUnterhalt()
	 * @generated
	 */
	void setFreiwilligerVerzichtAufUnterhalt(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AngabenZumUnterhaltType#isFreiwilligerVerzichtAufUnterhalt <em>Freiwilliger Verzicht Auf Unterhalt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFreiwilligerVerzichtAufUnterhalt()
	 * @see #isFreiwilligerVerzichtAufUnterhalt()
	 * @see #setFreiwilligerVerzichtAufUnterhalt(boolean)
	 * @generated
	 */
	void unsetFreiwilligerVerzichtAufUnterhalt();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AngabenZumUnterhaltType#isFreiwilligerVerzichtAufUnterhalt <em>Freiwilliger Verzicht Auf Unterhalt</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Freiwilliger Verzicht Auf Unterhalt</em>' attribute is set.
	 * @see #unsetFreiwilligerVerzichtAufUnterhalt()
	 * @see #isFreiwilligerVerzichtAufUnterhalt()
	 * @see #setFreiwilligerVerzichtAufUnterhalt(boolean)
	 * @generated
	 */
	boolean isSetFreiwilligerVerzichtAufUnterhalt();

	/**
	 * Returns the value of the '<em><b>Unterhalt Verzicht Zeitraum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * "Bitte geben Sie an, für welchen Zeitraum Sie auf Unterhalt verzichtet haben." Das Element soll eingeblendet werden, wenn freiwilligerVerzichtAufUnterhalt = true
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Unterhalt Verzicht Zeitraum</em>' attribute.
	 * @see #setUnterhaltVerzichtZeitraum(String)
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftPackage#getAngabenZumUnterhaltType_UnterhaltVerzichtZeitraum()
	 * @model dataType="de.xoev.kosit.datentyp._202204.din91379.DatatypeC"
	 *        extendedMetaData="kind='element' name='unterhaltVerzichtZeitraum' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUnterhaltVerzichtZeitraum();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AngabenZumUnterhaltType#getUnterhaltVerzichtZeitraum <em>Unterhalt Verzicht Zeitraum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unterhalt Verzicht Zeitraum</em>' attribute.
	 * @see #getUnterhaltVerzichtZeitraum()
	 * @generated
	 */
	void setUnterhaltVerzichtZeitraum(String value);

	/**
	 * Returns the value of the '<em><b>Zahlung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angabe, in welcher Form die Zahlung des Unterhalts erfolgt.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Zahlung</em>' containment reference.
	 * @see #setZahlung(CodeZahlungsartBSSType)
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftPackage#getAngabenZumUnterhaltType_Zahlung()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='zahlung' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeZahlungsartBSSType getZahlung();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AngabenZumUnterhaltType#getZahlung <em>Zahlung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zahlung</em>' containment reference.
	 * @see #getZahlung()
	 * @generated
	 */
	void setZahlung(CodeZahlungsartBSSType value);

	/**
	 * Returns the value of the '<em><b>Bankverbindung Zahlung Jugendamt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Konto, auf das der Unterhalt gezahlt werden soll. Nur anzugeben, wenn bei zahlung die Zahlung über das Jugendamt erfolgen soll.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bankverbindung Zahlung Jugendamt</em>' containment reference.
	 * @see #setBankverbindungZahlungJugendamt(BankverbindungType)
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftPackage#getAngabenZumUnterhaltType_BankverbindungZahlungJugendamt()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='bankverbindungZahlungJugendamt' namespace='##targetNamespace'"
	 * @generated
	 */
	BankverbindungType getBankverbindungZahlungJugendamt();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AngabenZumUnterhaltType#getBankverbindungZahlungJugendamt <em>Bankverbindung Zahlung Jugendamt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bankverbindung Zahlung Jugendamt</em>' containment reference.
	 * @see #getBankverbindungZahlungJugendamt()
	 * @generated
	 */
	void setBankverbindungZahlungJugendamt(BankverbindungType value);

	/**
	 * Returns the value of the '<em><b>Bankverbindung Direktzahlung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Konto, auf das der Unterhalt gezahlt werden soll. Nur anzugeben, wenn bei zahlung eine Direktzahlung erfolgen soll.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bankverbindung Direktzahlung</em>' containment reference.
	 * @see #setBankverbindungDirektzahlung(BankverbindungType)
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftPackage#getAngabenZumUnterhaltType_BankverbindungDirektzahlung()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='bankverbindungDirektzahlung' namespace='##targetNamespace'"
	 * @generated
	 */
	BankverbindungType getBankverbindungDirektzahlung();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AngabenZumUnterhaltType#getBankverbindungDirektzahlung <em>Bankverbindung Direktzahlung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bankverbindung Direktzahlung</em>' containment reference.
	 * @see #getBankverbindungDirektzahlung()
	 * @generated
	 */
	void setBankverbindungDirektzahlung(BankverbindungType value);

} // AngabenZumUnterhaltType
