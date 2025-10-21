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

import org.eclipse.emf.common.util.EList;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hilfen Zur Erziehung Eingliederungshilfe0703 Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.HilfenZurErziehungEingliederungshilfe0703Type#getAuswahlAnfrageEingliederung <em>Auswahl Anfrage Eingliederung</em>}</li>
 *   <li>{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.HilfenZurErziehungEingliederungshilfe0703Type#getAnliegensklaerungEingliederung <em>Anliegensklaerung Eingliederung</em>}</li>
 *   <li>{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.HilfenZurErziehungEingliederungshilfe0703Type#getPersoenlicheAngabenZuIhrerPerson <em>Persoenliche Angaben Zu Ihrer Person</em>}</li>
 *   <li>{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.HilfenZurErziehungEingliederungshilfe0703Type#getAngabenKind <em>Angaben Kind</em>}</li>
 *   <li>{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.HilfenZurErziehungEingliederungshilfe0703Type#getBegruendungHZE <em>Begruendung HZE</em>}</li>
 *   <li>{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.HilfenZurErziehungEingliederungshilfe0703Type#getAngabenElternteile <em>Angaben Elternteile</em>}</li>
 *   <li>{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.HilfenZurErziehungEingliederungshilfe0703Type#getDsgvo <em>Dsgvo</em>}</li>
 *   <li>{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.HilfenZurErziehungEingliederungshilfe0703Type#isRichtigkeitAngaben <em>Richtigkeit Angaben</em>}</li>
 *   <li>{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.HilfenZurErziehungEingliederungshilfe0703Type#isEinwilligungZwischenspeichern <em>Einwilligung Zwischenspeichern</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.ErziehungshilfePackage#getHilfenZurErziehungEingliederungshilfe0703Type()
 * @model extendedMetaData="name='hilfenZurErziehung.eingliederungshilfe.0703_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface HilfenZurErziehungEingliederungshilfe0703Type extends AntragsnachrichtType {
	/**
	 * Returns the value of the '<em><b>Auswahl Anfrage Eingliederung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Hier ist nur der Code Eingliederung zulässig.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Auswahl Anfrage Eingliederung</em>' containment reference.
	 * @see #setAuswahlAnfrageEingliederung(CodeAuswahlDerHilfeHzEType)
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.ErziehungshilfePackage#getHilfenZurErziehungEingliederungshilfe0703Type_AuswahlAnfrageEingliederung()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='auswahlAnfrageEingliederung' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeAuswahlDerHilfeHzEType getAuswahlAnfrageEingliederung();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.HilfenZurErziehungEingliederungshilfe0703Type#getAuswahlAnfrageEingliederung <em>Auswahl Anfrage Eingliederung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auswahl Anfrage Eingliederung</em>' containment reference.
	 * @see #getAuswahlAnfrageEingliederung()
	 * @generated
	 */
	void setAuswahlAnfrageEingliederung(CodeAuswahlDerHilfeHzEType value);

	/**
	 * Returns the value of the '<em><b>Anliegensklaerung Eingliederung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * In diesem Element wird geklärt, um welches Anliegen es im Antrag geht.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Anliegensklaerung Eingliederung</em>' containment reference.
	 * @see #setAnliegensklaerungEingliederung(AnliegensklaerungAnfrageType)
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.ErziehungshilfePackage#getHilfenZurErziehungEingliederungshilfe0703Type_AnliegensklaerungEingliederung()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='anliegensklaerungEingliederung' namespace='##targetNamespace'"
	 * @generated
	 */
	AnliegensklaerungAnfrageType getAnliegensklaerungEingliederung();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.HilfenZurErziehungEingliederungshilfe0703Type#getAnliegensklaerungEingliederung <em>Anliegensklaerung Eingliederung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Anliegensklaerung Eingliederung</em>' containment reference.
	 * @see #getAnliegensklaerungEingliederung()
	 * @generated
	 */
	void setAnliegensklaerungEingliederung(AnliegensklaerungAnfrageType value);

	/**
	 * Returns the value of the '<em><b>Persoenliche Angaben Zu Ihrer Person</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Auszufuellen, wenn junge*r Volljaehrige*r
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Persoenliche Angaben Zu Ihrer Person</em>' containment reference.
	 * @see #setPersoenlicheAngabenZuIhrerPerson(PersoenlicheAngabenEingliederungType)
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.ErziehungshilfePackage#getHilfenZurErziehungEingliederungshilfe0703Type_PersoenlicheAngabenZuIhrerPerson()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='persoenlicheAngabenZuIhrerPerson' namespace='##targetNamespace'"
	 * @generated
	 */
	PersoenlicheAngabenEingliederungType getPersoenlicheAngabenZuIhrerPerson();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.HilfenZurErziehungEingliederungshilfe0703Type#getPersoenlicheAngabenZuIhrerPerson <em>Persoenliche Angaben Zu Ihrer Person</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Persoenliche Angaben Zu Ihrer Person</em>' containment reference.
	 * @see #getPersoenlicheAngabenZuIhrerPerson()
	 * @generated
	 */
	void setPersoenlicheAngabenZuIhrerPerson(PersoenlicheAngabenEingliederungType value);

	/**
	 * Returns the value of the '<em><b>Angaben Kind</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angaben zum Kind, für das eine Eingliederungshilfe beantragt wird.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Angaben Kind</em>' containment reference.
	 * @see #setAngabenKind(AngabenKindEingliederungType)
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.ErziehungshilfePackage#getHilfenZurErziehungEingliederungshilfe0703Type_AngabenKind()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='angabenKind' namespace='##targetNamespace'"
	 * @generated
	 */
	AngabenKindEingliederungType getAngabenKind();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.HilfenZurErziehungEingliederungshilfe0703Type#getAngabenKind <em>Angaben Kind</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Angaben Kind</em>' containment reference.
	 * @see #getAngabenKind()
	 * @generated
	 */
	void setAngabenKind(AngabenKindEingliederungType value);

	/**
	 * Returns the value of the '<em><b>Begruendung HZE</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Begruendung HZE</em>' containment reference.
	 * @see #setBegruendungHZE(BegruendungDesHilfebedarfsType)
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.ErziehungshilfePackage#getHilfenZurErziehungEingliederungshilfe0703Type_BegruendungHZE()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='begruendungHZE' namespace='##targetNamespace'"
	 * @generated
	 */
	BegruendungDesHilfebedarfsType getBegruendungHZE();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.HilfenZurErziehungEingliederungshilfe0703Type#getBegruendungHZE <em>Begruendung HZE</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Begruendung HZE</em>' containment reference.
	 * @see #getBegruendungHZE()
	 * @generated
	 */
	void setBegruendungHZE(BegruendungDesHilfebedarfsType value);

	/**
	 * Returns the value of the '<em><b>Angaben Elternteile</b></em>' containment reference list.
	 * The list contents are of type {@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AngabenElternteilEingliederungType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Auszufuellen, wenn Mutter ODER Vater ODER Vormund Oder Pfleger:in ODER junger Mensch UND dieser unter 18 Jahre.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Angaben Elternteile</em>' containment reference list.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.ErziehungshilfePackage#getHilfenZurErziehungEingliederungshilfe0703Type_AngabenElternteile()
	 * @model containment="true" upper="2"
	 *        extendedMetaData="kind='element' name='angabenElternteile' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AngabenElternteilEingliederungType> getAngabenElternteile();

	/**
	 * Returns the value of the '<em><b>Dsgvo</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bestätigung zur Datenschutzerklärung des Dienst-betreibenden Landes sowie zur spezifischen Datenschutzerklärung des nachnutzenden Landes oder der nachnutzenden Kommune.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dsgvo</em>' containment reference.
	 * @see #setDsgvo(DatenschutzerklaerungenType)
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.ErziehungshilfePackage#getHilfenZurErziehungEingliederungshilfe0703Type_Dsgvo()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dsgvo' namespace='##targetNamespace'"
	 * @generated
	 */
	DatenschutzerklaerungenType getDsgvo();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.HilfenZurErziehungEingliederungshilfe0703Type#getDsgvo <em>Dsgvo</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dsgvo</em>' containment reference.
	 * @see #getDsgvo()
	 * @generated
	 */
	void setDsgvo(DatenschutzerklaerungenType value);

	/**
	 * Returns the value of the '<em><b>Richtigkeit Angaben</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Hiermit bestätige ich die Richtigkeit meiner Angaben. Ich versichere, dass ich diese nach bestem Wissen und Gewissen gemacht habe.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Richtigkeit Angaben</em>' attribute.
	 * @see #isSetRichtigkeitAngaben()
	 * @see #unsetRichtigkeitAngaben()
	 * @see #setRichtigkeitAngaben(boolean)
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.ErziehungshilfePackage#getHilfenZurErziehungEingliederungshilfe0703Type_RichtigkeitAngaben()
	 * @model default="true" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='richtigkeitAngaben' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isRichtigkeitAngaben();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.HilfenZurErziehungEingliederungshilfe0703Type#isRichtigkeitAngaben <em>Richtigkeit Angaben</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Richtigkeit Angaben</em>' attribute.
	 * @see #isSetRichtigkeitAngaben()
	 * @see #unsetRichtigkeitAngaben()
	 * @see #isRichtigkeitAngaben()
	 * @generated
	 */
	void setRichtigkeitAngaben(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.HilfenZurErziehungEingliederungshilfe0703Type#isRichtigkeitAngaben <em>Richtigkeit Angaben</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRichtigkeitAngaben()
	 * @see #isRichtigkeitAngaben()
	 * @see #setRichtigkeitAngaben(boolean)
	 * @generated
	 */
	void unsetRichtigkeitAngaben();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.HilfenZurErziehungEingliederungshilfe0703Type#isRichtigkeitAngaben <em>Richtigkeit Angaben</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Richtigkeit Angaben</em>' attribute is set.
	 * @see #unsetRichtigkeitAngaben()
	 * @see #isRichtigkeitAngaben()
	 * @see #setRichtigkeitAngaben(boolean)
	 * @generated
	 */
	boolean isSetRichtigkeitAngaben();

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
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.ErziehungshilfePackage#getHilfenZurErziehungEingliederungshilfe0703Type_EinwilligungZwischenspeichern()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='einwilligungZwischenspeichern' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isEinwilligungZwischenspeichern();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.HilfenZurErziehungEingliederungshilfe0703Type#isEinwilligungZwischenspeichern <em>Einwilligung Zwischenspeichern</em>}' attribute.
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
	 * Unsets the value of the '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.HilfenZurErziehungEingliederungshilfe0703Type#isEinwilligungZwischenspeichern <em>Einwilligung Zwischenspeichern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEinwilligungZwischenspeichern()
	 * @see #isEinwilligungZwischenspeichern()
	 * @see #setEinwilligungZwischenspeichern(boolean)
	 * @generated
	 */
	void unsetEinwilligungZwischenspeichern();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.HilfenZurErziehungEingliederungshilfe0703Type#isEinwilligungZwischenspeichern <em>Einwilligung Zwischenspeichern</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Einwilligung Zwischenspeichern</em>' attribute is set.
	 * @see #unsetEinwilligungZwischenspeichern()
	 * @see #isEinwilligungZwischenspeichern()
	 * @see #setEinwilligungZwischenspeichern(boolean)
	 * @generated
	 */
	boolean isSetEinwilligungZwischenspeichern();

} // HilfenZurErziehungEingliederungshilfe0703Type
