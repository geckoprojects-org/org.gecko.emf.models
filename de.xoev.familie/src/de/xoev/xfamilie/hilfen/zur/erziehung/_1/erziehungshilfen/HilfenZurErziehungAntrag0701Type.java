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
package de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen;

import de.xoev.xfamilie.baukasten._1.baukasten.AntragsnachrichtType;
import de.xoev.xfamilie.baukasten._1.baukasten.DatenschutzerklaerungenType;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hilfen Zur Erziehung Antrag0701 Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.HilfenZurErziehungAntrag0701Type#getAuswahlDerHilfeHZE <em>Auswahl Der Hilfe HZE</em>}</li>
 *   <li>{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.HilfenZurErziehungAntrag0701Type#getAnliegensklaerungHZE <em>Anliegensklaerung HZE</em>}</li>
 *   <li>{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.HilfenZurErziehungAntrag0701Type#getPruefcodeHZE <em>Pruefcode HZE</em>}</li>
 *   <li>{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.HilfenZurErziehungAntrag0701Type#getPersoenlicheAngabenZuIhrerPerson <em>Persoenliche Angaben Zu Ihrer Person</em>}</li>
 *   <li>{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.HilfenZurErziehungAntrag0701Type#getAndererElternteil <em>Anderer Elternteil</em>}</li>
 *   <li>{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.HilfenZurErziehungAntrag0701Type#getAngabenKindHZE <em>Angaben Kind HZE</em>}</li>
 *   <li>{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.HilfenZurErziehungAntrag0701Type#getNachweiseHZE <em>Nachweise HZE</em>}</li>
 *   <li>{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.HilfenZurErziehungAntrag0701Type#getDsgvo <em>Dsgvo</em>}</li>
 *   <li>{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.HilfenZurErziehungAntrag0701Type#getZusatzNachrichtHZE <em>Zusatz Nachricht HZE</em>}</li>
 *   <li>{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.HilfenZurErziehungAntrag0701Type#isEinwilligungZwischenspeichern <em>Einwilligung Zwischenspeichern</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.ErziehungshilfePackage#getHilfenZurErziehungAntrag0701Type()
 * @model extendedMetaData="name='hilfenZurErziehung.antrag.0701_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface HilfenZurErziehungAntrag0701Type extends AntragsnachrichtType {
	/**
	 * Returns the value of the '<em><b>Auswahl Der Hilfe HZE</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auswahl Der Hilfe HZE</em>' containment reference.
	 * @see #setAuswahlDerHilfeHZE(CodeAuswahlDerHilfeHzEType)
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.ErziehungshilfePackage#getHilfenZurErziehungAntrag0701Type_AuswahlDerHilfeHZE()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='auswahlDerHilfeHZE' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeAuswahlDerHilfeHzEType getAuswahlDerHilfeHZE();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.HilfenZurErziehungAntrag0701Type#getAuswahlDerHilfeHZE <em>Auswahl Der Hilfe HZE</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auswahl Der Hilfe HZE</em>' containment reference.
	 * @see #getAuswahlDerHilfeHZE()
	 * @generated
	 */
	void setAuswahlDerHilfeHZE(CodeAuswahlDerHilfeHzEType value);

	/**
	 * Returns the value of the '<em><b>Anliegensklaerung HZE</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * In diesem Element wird geklärt, um welches Anliegen es im Antrag geht.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Anliegensklaerung HZE</em>' containment reference.
	 * @see #setAnliegensklaerungHZE(AnliegensklaerungType)
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.ErziehungshilfePackage#getHilfenZurErziehungAntrag0701Type_AnliegensklaerungHZE()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='anliegensklaerungHZE' namespace='##targetNamespace'"
	 * @generated
	 */
	AnliegensklaerungType getAnliegensklaerungHZE();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.HilfenZurErziehungAntrag0701Type#getAnliegensklaerungHZE <em>Anliegensklaerung HZE</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Anliegensklaerung HZE</em>' containment reference.
	 * @see #getAnliegensklaerungHZE()
	 * @generated
	 */
	void setAnliegensklaerungHZE(AnliegensklaerungType value);

	/**
	 * Returns the value of the '<em><b>Pruefcode HZE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angabe eines Prüfcodes, der ein Beratungsgespräch sicherstellt.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pruefcode HZE</em>' attribute.
	 * @see #setPruefcodeHZE(String)
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.ErziehungshilfePackage#getHilfenZurErziehungAntrag0701Type_PruefcodeHZE()
	 * @model dataType="de.xoev.kosit.datentyp._202204.din91379.DatatypeC" required="true"
	 *        extendedMetaData="kind='element' name='pruefcodeHZE' namespace='##targetNamespace'"
	 * @generated
	 */
	String getPruefcodeHZE();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.HilfenZurErziehungAntrag0701Type#getPruefcodeHZE <em>Pruefcode HZE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pruefcode HZE</em>' attribute.
	 * @see #getPruefcodeHZE()
	 * @generated
	 */
	void setPruefcodeHZE(String value);

	/**
	 * Returns the value of the '<em><b>Persoenliche Angaben Zu Ihrer Person</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Die persoenlichen Angaben sind immer auszufuellen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Persoenliche Angaben Zu Ihrer Person</em>' containment reference.
	 * @see #setPersoenlicheAngabenZuIhrerPerson(PersoenlicheAngabenHZEType)
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.ErziehungshilfePackage#getHilfenZurErziehungAntrag0701Type_PersoenlicheAngabenZuIhrerPerson()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='persoenlicheAngabenZuIhrerPerson' namespace='##targetNamespace'"
	 * @generated
	 */
	PersoenlicheAngabenHZEType getPersoenlicheAngabenZuIhrerPerson();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.HilfenZurErziehungAntrag0701Type#getPersoenlicheAngabenZuIhrerPerson <em>Persoenliche Angaben Zu Ihrer Person</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Persoenliche Angaben Zu Ihrer Person</em>' containment reference.
	 * @see #getPersoenlicheAngabenZuIhrerPerson()
	 * @generated
	 */
	void setPersoenlicheAngabenZuIhrerPerson(PersoenlicheAngabenHZEType value);

	/**
	 * Returns the value of the '<em><b>Anderer Elternteil</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Auszufuellen, wenn Mutter ODER Vater
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Anderer Elternteil</em>' containment reference.
	 * @see #setAndererElternteil(AngabenETType)
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.ErziehungshilfePackage#getHilfenZurErziehungAntrag0701Type_AndererElternteil()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='andererElternteil' namespace='##targetNamespace'"
	 * @generated
	 */
	AngabenETType getAndererElternteil();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.HilfenZurErziehungAntrag0701Type#getAndererElternteil <em>Anderer Elternteil</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Anderer Elternteil</em>' containment reference.
	 * @see #getAndererElternteil()
	 * @generated
	 */
	void setAndererElternteil(AngabenETType value);

	/**
	 * Returns the value of the '<em><b>Angaben Kind HZE</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angaben zum Antragskind. Das Element angabenKindHZE ist nicht anzugeben, wenn auswahlDerHilfeHZE = 02 Hilfe für junge Volljährige
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Angaben Kind HZE</em>' containment reference.
	 * @see #setAngabenKindHZE(AngabenKindHZEType)
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.ErziehungshilfePackage#getHilfenZurErziehungAntrag0701Type_AngabenKindHZE()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='angabenKindHZE' namespace='##targetNamespace'"
	 * @generated
	 */
	AngabenKindHZEType getAngabenKindHZE();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.HilfenZurErziehungAntrag0701Type#getAngabenKindHZE <em>Angaben Kind HZE</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Angaben Kind HZE</em>' containment reference.
	 * @see #getAngabenKindHZE()
	 * @generated
	 */
	void setAngabenKindHZE(AngabenKindHZEType value);

	/**
	 * Returns the value of the '<em><b>Nachweise HZE</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bitte laden Sie hier die vom Jugendamt angeforderten Nachweise hoch. Sie finden die Auflistung der notwendigen Nachweise auf dem Dokument, dass Sie vom Jugendamt bekommen haben.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nachweise HZE</em>' containment reference.
	 * @see #setNachweiseHZE(NachweiseHZEType)
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.ErziehungshilfePackage#getHilfenZurErziehungAntrag0701Type_NachweiseHZE()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='nachweiseHZE' namespace='##targetNamespace'"
	 * @generated
	 */
	NachweiseHZEType getNachweiseHZE();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.HilfenZurErziehungAntrag0701Type#getNachweiseHZE <em>Nachweise HZE</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nachweise HZE</em>' containment reference.
	 * @see #getNachweiseHZE()
	 * @generated
	 */
	void setNachweiseHZE(NachweiseHZEType value);

	/**
	 * Returns the value of the '<em><b>Dsgvo</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bestätigung zur Datenschutzerklärung des Dienst-betreibenden Landes sowie zur spezifischen Datenschutzerklärung des nachnutzenden Landes oder der nachnutzenden Kommune.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dsgvo</em>' containment reference.
	 * @see #setDsgvo(DatenschutzerklaerungenType)
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.ErziehungshilfePackage#getHilfenZurErziehungAntrag0701Type_Dsgvo()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dsgvo' namespace='##targetNamespace'"
	 * @generated
	 */
	DatenschutzerklaerungenType getDsgvo();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.HilfenZurErziehungAntrag0701Type#getDsgvo <em>Dsgvo</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dsgvo</em>' containment reference.
	 * @see #getDsgvo()
	 * @generated
	 */
	void setDsgvo(DatenschutzerklaerungenType value);

	/**
	 * Returns the value of the '<em><b>Zusatz Nachricht HZE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Möchten Sie dem Jugendamt noch etwas mitteilen?
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Zusatz Nachricht HZE</em>' attribute.
	 * @see #setZusatzNachrichtHZE(String)
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.ErziehungshilfePackage#getHilfenZurErziehungAntrag0701Type_ZusatzNachrichtHZE()
	 * @model dataType="de.xoev.kosit.datentyp._202204.din91379.DatatypeC"
	 *        extendedMetaData="kind='element' name='zusatzNachrichtHZE' namespace='##targetNamespace'"
	 * @generated
	 */
	String getZusatzNachrichtHZE();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.HilfenZurErziehungAntrag0701Type#getZusatzNachrichtHZE <em>Zusatz Nachricht HZE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zusatz Nachricht HZE</em>' attribute.
	 * @see #getZusatzNachrichtHZE()
	 * @generated
	 */
	void setZusatzNachrichtHZE(String value);

	/**
	 * Returns the value of the '<em><b>Einwilligung Zwischenspeichern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Einwilligung zur Zwischenspeicherung der Antragsdaten.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Einwilligung Zwischenspeichern</em>' attribute.
	 * @see #isSetEinwilligungZwischenspeichern()
	 * @see #unsetEinwilligungZwischenspeichern()
	 * @see #setEinwilligungZwischenspeichern(boolean)
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.ErziehungshilfePackage#getHilfenZurErziehungAntrag0701Type_EinwilligungZwischenspeichern()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='einwilligungZwischenspeichern' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isEinwilligungZwischenspeichern();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.HilfenZurErziehungAntrag0701Type#isEinwilligungZwischenspeichern <em>Einwilligung Zwischenspeichern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Einwilligung Zwischenspeichern</em>' attribute.
	 * @see #isSetEinwilligungZwischenspeichern()
	 * @see #unsetEinwilligungZwischenspeichern()
	 * @see #isEinwilligungZwischenspeichern()
	 * @generated
	 */
	void setEinwilligungZwischenspeichern(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.HilfenZurErziehungAntrag0701Type#isEinwilligungZwischenspeichern <em>Einwilligung Zwischenspeichern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEinwilligungZwischenspeichern()
	 * @see #isEinwilligungZwischenspeichern()
	 * @see #setEinwilligungZwischenspeichern(boolean)
	 * @generated
	 */
	void unsetEinwilligungZwischenspeichern();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.HilfenZurErziehungAntrag0701Type#isEinwilligungZwischenspeichern <em>Einwilligung Zwischenspeichern</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Einwilligung Zwischenspeichern</em>' attribute is set.
	 * @see #unsetEinwilligungZwischenspeichern()
	 * @see #isEinwilligungZwischenspeichern()
	 * @see #setEinwilligungZwischenspeichern(boolean)
	 * @generated
	 */
	boolean isSetEinwilligungZwischenspeichern();

} // HilfenZurErziehungAntrag0701Type
