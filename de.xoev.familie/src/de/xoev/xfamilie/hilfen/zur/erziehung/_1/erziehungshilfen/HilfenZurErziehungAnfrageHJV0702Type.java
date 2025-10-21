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
 * A representation of the model object '<em><b>Hilfen Zur Erziehung Anfrage HJV0702 Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.HilfenZurErziehungAnfrageHJV0702Type#getAuswahlAnfrageHJV <em>Auswahl Anfrage HJV</em>}</li>
 *   <li>{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.HilfenZurErziehungAnfrageHJV0702Type#getAnliegensklaerungHJV <em>Anliegensklaerung HJV</em>}</li>
 *   <li>{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.HilfenZurErziehungAnfrageHJV0702Type#getPersoenlicheAngabenHJV <em>Persoenliche Angaben HJV</em>}</li>
 *   <li>{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.HilfenZurErziehungAnfrageHJV0702Type#getBegruendungHJV <em>Begruendung HJV</em>}</li>
 *   <li>{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.HilfenZurErziehungAnfrageHJV0702Type#getAngabenAndererElternteil <em>Angaben Anderer Elternteil</em>}</li>
 *   <li>{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.HilfenZurErziehungAnfrageHJV0702Type#getDsgvo <em>Dsgvo</em>}</li>
 *   <li>{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.HilfenZurErziehungAnfrageHJV0702Type#isRichtigkeitAngaben <em>Richtigkeit Angaben</em>}</li>
 *   <li>{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.HilfenZurErziehungAnfrageHJV0702Type#isEinwilligungZwischenspeichern <em>Einwilligung Zwischenspeichern</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.ErziehungshilfePackage#getHilfenZurErziehungAnfrageHJV0702Type()
 * @model extendedMetaData="name='hilfenZurErziehung.anfrageHJV.0702_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface HilfenZurErziehungAnfrageHJV0702Type extends AntragsnachrichtType {
	/**
	 * Returns the value of the '<em><b>Auswahl Anfrage HJV</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * In diesem Element wird geklärt, um welches Anliegen es im Antrag geht. Hier sind die Codes HzE, HjV und "Ich weiß es nicht" zulässig.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Auswahl Anfrage HJV</em>' containment reference.
	 * @see #setAuswahlAnfrageHJV(CodeAuswahlDerHilfeHzEType)
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.ErziehungshilfePackage#getHilfenZurErziehungAnfrageHJV0702Type_AuswahlAnfrageHJV()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='auswahlAnfrageHJV' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeAuswahlDerHilfeHzEType getAuswahlAnfrageHJV();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.HilfenZurErziehungAnfrageHJV0702Type#getAuswahlAnfrageHJV <em>Auswahl Anfrage HJV</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auswahl Anfrage HJV</em>' containment reference.
	 * @see #getAuswahlAnfrageHJV()
	 * @generated
	 */
	void setAuswahlAnfrageHJV(CodeAuswahlDerHilfeHzEType value);

	/**
	 * Returns the value of the '<em><b>Anliegensklaerung HJV</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * In diesem Element wird geklärt, um welches Anliegen es im Antrag geht.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Anliegensklaerung HJV</em>' containment reference.
	 * @see #setAnliegensklaerungHJV(AnliegensklaerungAnfrageType)
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.ErziehungshilfePackage#getHilfenZurErziehungAnfrageHJV0702Type_AnliegensklaerungHJV()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='anliegensklaerungHJV' namespace='##targetNamespace'"
	 * @generated
	 */
	AnliegensklaerungAnfrageType getAnliegensklaerungHJV();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.HilfenZurErziehungAnfrageHJV0702Type#getAnliegensklaerungHJV <em>Anliegensklaerung HJV</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Anliegensklaerung HJV</em>' containment reference.
	 * @see #getAnliegensklaerungHJV()
	 * @generated
	 */
	void setAnliegensklaerungHJV(AnliegensklaerungAnfrageType value);

	/**
	 * Returns the value of the '<em><b>Persoenliche Angaben HJV</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Auszufuellen, wenn Mutter ODER Vater ODER Vormund*in/Pfleger*in UND sorgeberechtigt = True ODER wenn Anfrage von jungen Volljaehrigen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Persoenliche Angaben HJV</em>' containment reference.
	 * @see #setPersoenlicheAngabenHJV(PersoenlicheAngabenHJVType)
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.ErziehungshilfePackage#getHilfenZurErziehungAnfrageHJV0702Type_PersoenlicheAngabenHJV()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='persoenlicheAngabenHJV' namespace='##targetNamespace'"
	 * @generated
	 */
	PersoenlicheAngabenHJVType getPersoenlicheAngabenHJV();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.HilfenZurErziehungAnfrageHJV0702Type#getPersoenlicheAngabenHJV <em>Persoenliche Angaben HJV</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Persoenliche Angaben HJV</em>' containment reference.
	 * @see #getPersoenlicheAngabenHJV()
	 * @generated
	 */
	void setPersoenlicheAngabenHJV(PersoenlicheAngabenHJVType value);

	/**
	 * Returns the value of the '<em><b>Begruendung HJV</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Begruendung HJV</em>' containment reference.
	 * @see #setBegruendungHJV(BegruendungDesHilfebedarfsType)
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.ErziehungshilfePackage#getHilfenZurErziehungAnfrageHJV0702Type_BegruendungHJV()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='begruendungHJV' namespace='##targetNamespace'"
	 * @generated
	 */
	BegruendungDesHilfebedarfsType getBegruendungHJV();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.HilfenZurErziehungAnfrageHJV0702Type#getBegruendungHJV <em>Begruendung HJV</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Begruendung HJV</em>' containment reference.
	 * @see #getBegruendungHJV()
	 * @generated
	 */
	void setBegruendungHJV(BegruendungDesHilfebedarfsType value);

	/**
	 * Returns the value of the '<em><b>Angaben Anderer Elternteil</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Auszufuellen, wenn Mutter ODER Vater ODER Vormund*in/Pfleger*in UND sorgeberechtigt = True; NICHT auszufuellen, wenn Anfrage von jungen Volljaehrigen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Angaben Anderer Elternteil</em>' containment reference.
	 * @see #setAngabenAndererElternteil(AngabenElternteilHJVType)
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.ErziehungshilfePackage#getHilfenZurErziehungAnfrageHJV0702Type_AngabenAndererElternteil()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='angabenAndererElternteil' namespace='##targetNamespace'"
	 * @generated
	 */
	AngabenElternteilHJVType getAngabenAndererElternteil();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.HilfenZurErziehungAnfrageHJV0702Type#getAngabenAndererElternteil <em>Angaben Anderer Elternteil</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Angaben Anderer Elternteil</em>' containment reference.
	 * @see #getAngabenAndererElternteil()
	 * @generated
	 */
	void setAngabenAndererElternteil(AngabenElternteilHJVType value);

	/**
	 * Returns the value of the '<em><b>Dsgvo</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bestätigung zur Datenschutzerklärung des Dienst-betreibenden Landes sowie zur spezifischen Datenschutzerklärung des nachnutzenden Landes oder der nachnutzenden Kommune.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dsgvo</em>' containment reference.
	 * @see #setDsgvo(DatenschutzerklaerungenType)
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.ErziehungshilfePackage#getHilfenZurErziehungAnfrageHJV0702Type_Dsgvo()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dsgvo' namespace='##targetNamespace'"
	 * @generated
	 */
	DatenschutzerklaerungenType getDsgvo();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.HilfenZurErziehungAnfrageHJV0702Type#getDsgvo <em>Dsgvo</em>}' containment reference.
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
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.ErziehungshilfePackage#getHilfenZurErziehungAnfrageHJV0702Type_RichtigkeitAngaben()
	 * @model default="true" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='richtigkeitAngaben' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isRichtigkeitAngaben();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.HilfenZurErziehungAnfrageHJV0702Type#isRichtigkeitAngaben <em>Richtigkeit Angaben</em>}' attribute.
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
	 * Unsets the value of the '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.HilfenZurErziehungAnfrageHJV0702Type#isRichtigkeitAngaben <em>Richtigkeit Angaben</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRichtigkeitAngaben()
	 * @see #isRichtigkeitAngaben()
	 * @see #setRichtigkeitAngaben(boolean)
	 * @generated
	 */
	void unsetRichtigkeitAngaben();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.HilfenZurErziehungAnfrageHJV0702Type#isRichtigkeitAngaben <em>Richtigkeit Angaben</em>}' attribute is set.
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
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.ErziehungshilfePackage#getHilfenZurErziehungAnfrageHJV0702Type_EinwilligungZwischenspeichern()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='einwilligungZwischenspeichern' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isEinwilligungZwischenspeichern();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.HilfenZurErziehungAnfrageHJV0702Type#isEinwilligungZwischenspeichern <em>Einwilligung Zwischenspeichern</em>}' attribute.
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
	 * Unsets the value of the '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.HilfenZurErziehungAnfrageHJV0702Type#isEinwilligungZwischenspeichern <em>Einwilligung Zwischenspeichern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEinwilligungZwischenspeichern()
	 * @see #isEinwilligungZwischenspeichern()
	 * @see #setEinwilligungZwischenspeichern(boolean)
	 * @generated
	 */
	void unsetEinwilligungZwischenspeichern();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.HilfenZurErziehungAnfrageHJV0702Type#isEinwilligungZwischenspeichern <em>Einwilligung Zwischenspeichern</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Einwilligung Zwischenspeichern</em>' attribute is set.
	 * @see #unsetEinwilligungZwischenspeichern()
	 * @see #isEinwilligungZwischenspeichern()
	 * @see #setEinwilligungZwischenspeichern(boolean)
	 * @generated
	 */
	boolean isSetEinwilligungZwischenspeichern();

} // HilfenZurErziehungAnfrageHJV0702Type
