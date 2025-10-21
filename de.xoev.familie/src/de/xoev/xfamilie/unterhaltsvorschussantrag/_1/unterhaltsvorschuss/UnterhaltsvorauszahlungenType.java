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
package de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss;

import de.xoev.xfamilie.baukasten._1.baukasten.TeilbekanntesDatumType;
import de.xoev.xfamilie.baukasten._1.baukasten.ZeitraumType;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unterhaltsvorauszahlungen Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Daten zu Vorauszahlungen des Unterhalts.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorauszahlungenType#getZeitraumDerVorauszahlung <em>Zeitraum Der Vorauszahlung</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorauszahlungenType#getBetragDerVorausZahlung <em>Betrag Der Voraus Zahlung</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorauszahlungenType#getDatumDerVorauszahlung <em>Datum Der Vorauszahlung</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorauszahlungenType#isZahlungenDritter <em>Zahlungen Dritter</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorauszahlungenType#getPersonZahlungenDritter <em>Person Zahlungen Dritter</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorauszahlungenType#getHoeheZahlungenDritter <em>Hoehe Zahlungen Dritter</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getUnterhaltsvorauszahlungenType()
 * @model extendedMetaData="name='UnterhaltsvorauszahlungenType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface UnterhaltsvorauszahlungenType extends EObject {
	/**
	 * Returns the value of the '<em><b>Zeitraum Der Vorauszahlung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Daten zu Zeiträumen von Vorauszahlungen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Zeitraum Der Vorauszahlung</em>' containment reference.
	 * @see #setZeitraumDerVorauszahlung(ZeitraumType)
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getUnterhaltsvorauszahlungenType_ZeitraumDerVorauszahlung()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='zeitraumDerVorauszahlung' namespace='##targetNamespace'"
	 * @generated
	 */
	ZeitraumType getZeitraumDerVorauszahlung();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorauszahlungenType#getZeitraumDerVorauszahlung <em>Zeitraum Der Vorauszahlung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zeitraum Der Vorauszahlung</em>' containment reference.
	 * @see #getZeitraumDerVorauszahlung()
	 * @generated
	 */
	void setZeitraumDerVorauszahlung(ZeitraumType value);

	/**
	 * Returns the value of the '<em><b>Betrag Der Voraus Zahlung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Datum zu dem Betrag der Vorauszahlung.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Betrag Der Voraus Zahlung</em>' attribute.
	 * @see #setBetragDerVorausZahlung(String)
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getUnterhaltsvorauszahlungenType_BetragDerVorausZahlung()
	 * @model dataType="de.xoev.kosit.datentyp._202204.din91379.DatatypeC"
	 *        extendedMetaData="kind='element' name='betragDerVorausZahlung' namespace='##targetNamespace'"
	 * @generated
	 */
	String getBetragDerVorausZahlung();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorauszahlungenType#getBetragDerVorausZahlung <em>Betrag Der Voraus Zahlung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Betrag Der Voraus Zahlung</em>' attribute.
	 * @see #getBetragDerVorausZahlung()
	 * @generated
	 */
	void setBetragDerVorausZahlung(String value);

	/**
	 * Returns the value of the '<em><b>Datum Der Vorauszahlung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Datum, wann die Vorauszahlung erfolgte.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Datum Der Vorauszahlung</em>' containment reference.
	 * @see #setDatumDerVorauszahlung(TeilbekanntesDatumType)
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getUnterhaltsvorauszahlungenType_DatumDerVorauszahlung()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='datumDerVorauszahlung' namespace='##targetNamespace'"
	 * @generated
	 */
	TeilbekanntesDatumType getDatumDerVorauszahlung();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorauszahlungenType#getDatumDerVorauszahlung <em>Datum Der Vorauszahlung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datum Der Vorauszahlung</em>' containment reference.
	 * @see #getDatumDerVorauszahlung()
	 * @generated
	 */
	void setDatumDerVorauszahlung(TeilbekanntesDatumType value);

	/**
	 * Returns the value of the '<em><b>Zahlungen Dritter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Erhält das Kind Zahlungen von Dritten?
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Zahlungen Dritter</em>' attribute.
	 * @see #isSetZahlungenDritter()
	 * @see #unsetZahlungenDritter()
	 * @see #setZahlungenDritter(boolean)
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getUnterhaltsvorauszahlungenType_ZahlungenDritter()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='zahlungenDritter' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isZahlungenDritter();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorauszahlungenType#isZahlungenDritter <em>Zahlungen Dritter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zahlungen Dritter</em>' attribute.
	 * @see #isSetZahlungenDritter()
	 * @see #unsetZahlungenDritter()
	 * @see #isZahlungenDritter()
	 * @generated
	 */
	void setZahlungenDritter(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorauszahlungenType#isZahlungenDritter <em>Zahlungen Dritter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetZahlungenDritter()
	 * @see #isZahlungenDritter()
	 * @see #setZahlungenDritter(boolean)
	 * @generated
	 */
	void unsetZahlungenDritter();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorauszahlungenType#isZahlungenDritter <em>Zahlungen Dritter</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Zahlungen Dritter</em>' attribute is set.
	 * @see #unsetZahlungenDritter()
	 * @see #isZahlungenDritter()
	 * @see #setZahlungenDritter(boolean)
	 * @generated
	 */
	boolean isSetZahlungenDritter();

	/**
	 * Returns the value of the '<em><b>Person Zahlungen Dritter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Von wem werden die Zahlungen getätigt?
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Person Zahlungen Dritter</em>' attribute.
	 * @see #setPersonZahlungenDritter(String)
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getUnterhaltsvorauszahlungenType_PersonZahlungenDritter()
	 * @model dataType="de.xoev.kosit.datentyp._202204.din91379.DatatypeC"
	 *        extendedMetaData="kind='element' name='personZahlungenDritter' namespace='##targetNamespace'"
	 * @generated
	 */
	String getPersonZahlungenDritter();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorauszahlungenType#getPersonZahlungenDritter <em>Person Zahlungen Dritter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Person Zahlungen Dritter</em>' attribute.
	 * @see #getPersonZahlungenDritter()
	 * @generated
	 */
	void setPersonZahlungenDritter(String value);

	/**
	 * Returns the value of the '<em><b>Hoehe Zahlungen Dritter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * In welcher Höhe werden die Zahlungen getätigt?
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hoehe Zahlungen Dritter</em>' attribute.
	 * @see #setHoeheZahlungenDritter(String)
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getUnterhaltsvorauszahlungenType_HoeheZahlungenDritter()
	 * @model dataType="de.xoev.kosit.datentyp._202204.din91379.DatatypeC"
	 *        extendedMetaData="kind='element' name='hoeheZahlungenDritter' namespace='##targetNamespace'"
	 * @generated
	 */
	String getHoeheZahlungenDritter();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorauszahlungenType#getHoeheZahlungenDritter <em>Hoehe Zahlungen Dritter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hoehe Zahlungen Dritter</em>' attribute.
	 * @see #getHoeheZahlungenDritter()
	 * @generated
	 */
	void setHoeheZahlungenDritter(String value);

} // UnterhaltsvorauszahlungenType
