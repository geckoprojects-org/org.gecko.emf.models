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

import de.xoev.xfamilie.baukasten._1.baukasten.AntragsnachrichtType;
import de.xoev.xfamilie.baukasten._1.baukasten.DatenabrufType;
import de.xoev.xfamilie.baukasten._1.baukasten.DatenschutzerklaerungenType;
import de.xoev.xfamilie.baukasten._1.baukasten.NachweisdokumentType;

import java.math.BigInteger;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unterhaltsvorschussantrag Jaehrliche Ueberpruefung0302 Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussantragJaehrlicheUeberpruefung0302Type#getGesamtZahlDerNachrichten <em>Gesamt Zahl Der Nachrichten</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussantragJaehrlicheUeberpruefung0302Type#getAntragskind <em>Antragskind</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussantragJaehrlicheUeberpruefung0302Type#getAntragstellenderElternteil <em>Antragstellender Elternteil</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussantragJaehrlicheUeberpruefung0302Type#getAndererElternteil <em>Anderer Elternteil</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussantragJaehrlicheUeberpruefung0302Type#getUnterhalt <em>Unterhalt</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussantragJaehrlicheUeberpruefung0302Type#getDatenabruf <em>Datenabruf</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussantragJaehrlicheUeberpruefung0302Type#getPdfAntrag <em>Pdf Antrag</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussantragJaehrlicheUeberpruefung0302Type#isWartenAufUnterschrift <em>Warten Auf Unterschrift</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussantragJaehrlicheUeberpruefung0302Type#getDsgvo <em>Dsgvo</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussantragJaehrlicheUeberpruefung0302Type#isArtSignaturDigital <em>Art Signatur Digital</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussantragJaehrlicheUeberpruefung0302Type#getBestaetigungAngaben <em>Bestaetigung Angaben</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussantragJaehrlicheUeberpruefung0302Type#isMerkblattUVG <em>Merkblatt UVG</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getUnterhaltsvorschussantragJaehrlicheUeberpruefung0302Type()
 * @model extendedMetaData="name='unterhaltsvorschussantrag.JaehrlicheUeberpruefung.0302_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface UnterhaltsvorschussantragJaehrlicheUeberpruefung0302Type extends AntragsnachrichtType {
	/**
	 * Returns the value of the '<em><b>Gesamt Zahl Der Nachrichten</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Hiermit wird die Gesamtzahl der zu erwartenden Nachrichten übersandt.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Gesamt Zahl Der Nachrichten</em>' attribute.
	 * @see #setGesamtZahlDerNachrichten(BigInteger)
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getUnterhaltsvorschussantragJaehrlicheUeberpruefung0302Type_GesamtZahlDerNachrichten()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NonNegativeInteger" required="true"
	 *        extendedMetaData="kind='element' name='gesamtZahlDerNachrichten' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getGesamtZahlDerNachrichten();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussantragJaehrlicheUeberpruefung0302Type#getGesamtZahlDerNachrichten <em>Gesamt Zahl Der Nachrichten</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gesamt Zahl Der Nachrichten</em>' attribute.
	 * @see #getGesamtZahlDerNachrichten()
	 * @generated
	 */
	void setGesamtZahlDerNachrichten(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Antragskind</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Hiermit werden die Daten zum Antragskind übertragen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Antragskind</em>' containment reference.
	 * @see #setAntragskind(AntragskindUeberpruefungType)
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getUnterhaltsvorschussantragJaehrlicheUeberpruefung0302Type_Antragskind()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='antragskind' namespace='##targetNamespace'"
	 * @generated
	 */
	AntragskindUeberpruefungType getAntragskind();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussantragJaehrlicheUeberpruefung0302Type#getAntragskind <em>Antragskind</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Antragskind</em>' containment reference.
	 * @see #getAntragskind()
	 * @generated
	 */
	void setAntragskind(AntragskindUeberpruefungType value);

	/**
	 * Returns the value of the '<em><b>Antragstellender Elternteil</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Hiermit werden die Daten zum antragstellenden Elternteil übertragen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Antragstellender Elternteil</em>' containment reference.
	 * @see #setAntragstellenderElternteil(AntragstellenderElternteilUeberpruefungType)
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getUnterhaltsvorschussantragJaehrlicheUeberpruefung0302Type_AntragstellenderElternteil()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='antragstellenderElternteil' namespace='##targetNamespace'"
	 * @generated
	 */
	AntragstellenderElternteilUeberpruefungType getAntragstellenderElternteil();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussantragJaehrlicheUeberpruefung0302Type#getAntragstellenderElternteil <em>Antragstellender Elternteil</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Antragstellender Elternteil</em>' containment reference.
	 * @see #getAntragstellenderElternteil()
	 * @generated
	 */
	void setAntragstellenderElternteil(AntragstellenderElternteilUeberpruefungType value);

	/**
	 * Returns the value of the '<em><b>Anderer Elternteil</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Hiermit werden die Daten zum anderen Elternteil übertragen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Anderer Elternteil</em>' containment reference.
	 * @see #setAndererElternteil(AndererElternteilUeberpruefungType)
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getUnterhaltsvorschussantragJaehrlicheUeberpruefung0302Type_AndererElternteil()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='andererElternteil' namespace='##targetNamespace'"
	 * @generated
	 */
	AndererElternteilUeberpruefungType getAndererElternteil();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussantragJaehrlicheUeberpruefung0302Type#getAndererElternteil <em>Anderer Elternteil</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Anderer Elternteil</em>' containment reference.
	 * @see #getAndererElternteil()
	 * @generated
	 */
	void setAndererElternteil(AndererElternteilUeberpruefungType value);

	/**
	 * Returns the value of the '<em><b>Unterhalt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Hiermit werden Daten zum Unterhalt übertragen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Unterhalt</em>' containment reference.
	 * @see #setUnterhalt(UnterhaltUeberpruefungType)
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getUnterhaltsvorschussantragJaehrlicheUeberpruefung0302Type_Unterhalt()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='unterhalt' namespace='##targetNamespace'"
	 * @generated
	 */
	UnterhaltUeberpruefungType getUnterhalt();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussantragJaehrlicheUeberpruefung0302Type#getUnterhalt <em>Unterhalt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unterhalt</em>' containment reference.
	 * @see #getUnterhalt()
	 * @generated
	 */
	void setUnterhalt(UnterhaltUeberpruefungType value);

	/**
	 * Returns the value of the '<em><b>Datenabruf</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datenabruf</em>' containment reference.
	 * @see #setDatenabruf(DatenabrufType)
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getUnterhaltsvorschussantragJaehrlicheUeberpruefung0302Type_Datenabruf()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='datenabruf' namespace='##targetNamespace'"
	 * @generated
	 */
	DatenabrufType getDatenabruf();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussantragJaehrlicheUeberpruefung0302Type#getDatenabruf <em>Datenabruf</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datenabruf</em>' containment reference.
	 * @see #getDatenabruf()
	 * @generated
	 */
	void setDatenabruf(DatenabrufType value);

	/**
	 * Returns the value of the '<em><b>Pdf Antrag</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pdf Antrag</em>' containment reference.
	 * @see #setPdfAntrag(NachweisdokumentType)
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getUnterhaltsvorschussantragJaehrlicheUeberpruefung0302Type_PdfAntrag()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='pdfAntrag' namespace='##targetNamespace'"
	 * @generated
	 */
	NachweisdokumentType getPdfAntrag();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussantragJaehrlicheUeberpruefung0302Type#getPdfAntrag <em>Pdf Antrag</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pdf Antrag</em>' containment reference.
	 * @see #getPdfAntrag()
	 * @generated
	 */
	void setPdfAntrag(NachweisdokumentType value);

	/**
	 * Returns the value of the '<em><b>Warten Auf Unterschrift</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Warten Auf Unterschrift</em>' attribute.
	 * @see #isSetWartenAufUnterschrift()
	 * @see #unsetWartenAufUnterschrift()
	 * @see #setWartenAufUnterschrift(boolean)
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getUnterhaltsvorschussantragJaehrlicheUeberpruefung0302Type_WartenAufUnterschrift()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='wartenAufUnterschrift' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isWartenAufUnterschrift();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussantragJaehrlicheUeberpruefung0302Type#isWartenAufUnterschrift <em>Warten Auf Unterschrift</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Warten Auf Unterschrift</em>' attribute.
	 * @see #isSetWartenAufUnterschrift()
	 * @see #unsetWartenAufUnterschrift()
	 * @see #isWartenAufUnterschrift()
	 * @generated
	 */
	void setWartenAufUnterschrift(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussantragJaehrlicheUeberpruefung0302Type#isWartenAufUnterschrift <em>Warten Auf Unterschrift</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWartenAufUnterschrift()
	 * @see #isWartenAufUnterschrift()
	 * @see #setWartenAufUnterschrift(boolean)
	 * @generated
	 */
	void unsetWartenAufUnterschrift();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussantragJaehrlicheUeberpruefung0302Type#isWartenAufUnterschrift <em>Warten Auf Unterschrift</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Warten Auf Unterschrift</em>' attribute is set.
	 * @see #unsetWartenAufUnterschrift()
	 * @see #isWartenAufUnterschrift()
	 * @see #setWartenAufUnterschrift(boolean)
	 * @generated
	 */
	boolean isSetWartenAufUnterschrift();

	/**
	 * Returns the value of the '<em><b>Dsgvo</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bestätigung zur Datenschutzerklärung des Dienst-betreibenden Landes sowie zur spezifischen Datenschutzerklärung des nachnutzenden Landes oder der nachnutzenden Kommune.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dsgvo</em>' containment reference.
	 * @see #setDsgvo(DatenschutzerklaerungenType)
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getUnterhaltsvorschussantragJaehrlicheUeberpruefung0302Type_Dsgvo()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='dsgvo' namespace='##targetNamespace'"
	 * @generated
	 */
	DatenschutzerklaerungenType getDsgvo();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussantragJaehrlicheUeberpruefung0302Type#getDsgvo <em>Dsgvo</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dsgvo</em>' containment reference.
	 * @see #getDsgvo()
	 * @generated
	 */
	void setDsgvo(DatenschutzerklaerungenType value);

	/**
	 * Returns the value of the '<em><b>Art Signatur Digital</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Pro Antrag wird hinterlegt, welche Art der Signatur (digital oder mit Unterschriften-Seite) gewählt wurde. Beim Wert "true" handelt es sich um eine digitale Sigantur. Es ist wichtig für die Sachbearbeitung, dass im Fachverfahren eingesehen werden kann, wie der Antrag unterschrieben wurde, um bei digitaler Signatur die Bearbeitung direkt beginnen zu können oder ggf. auf den postalischen Mantelbogen zu warten.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Art Signatur Digital</em>' attribute.
	 * @see #isSetArtSignaturDigital()
	 * @see #unsetArtSignaturDigital()
	 * @see #setArtSignaturDigital(boolean)
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getUnterhaltsvorschussantragJaehrlicheUeberpruefung0302Type_ArtSignaturDigital()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='artSignaturDigital' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isArtSignaturDigital();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussantragJaehrlicheUeberpruefung0302Type#isArtSignaturDigital <em>Art Signatur Digital</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Art Signatur Digital</em>' attribute.
	 * @see #isSetArtSignaturDigital()
	 * @see #unsetArtSignaturDigital()
	 * @see #isArtSignaturDigital()
	 * @generated
	 */
	void setArtSignaturDigital(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussantragJaehrlicheUeberpruefung0302Type#isArtSignaturDigital <em>Art Signatur Digital</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetArtSignaturDigital()
	 * @see #isArtSignaturDigital()
	 * @see #setArtSignaturDigital(boolean)
	 * @generated
	 */
	void unsetArtSignaturDigital();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussantragJaehrlicheUeberpruefung0302Type#isArtSignaturDigital <em>Art Signatur Digital</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Art Signatur Digital</em>' attribute is set.
	 * @see #unsetArtSignaturDigital()
	 * @see #isArtSignaturDigital()
	 * @see #setArtSignaturDigital(boolean)
	 * @generated
	 */
	boolean isSetArtSignaturDigital();

	/**
	 * Returns the value of the '<em><b>Bestaetigung Angaben</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bestaetigung Angaben</em>' containment reference.
	 * @see #setBestaetigungAngaben(BestaetigungAngabenType)
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getUnterhaltsvorschussantragJaehrlicheUeberpruefung0302Type_BestaetigungAngaben()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='bestaetigungAngaben' namespace='##targetNamespace'"
	 * @generated
	 */
	BestaetigungAngabenType getBestaetigungAngaben();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussantragJaehrlicheUeberpruefung0302Type#getBestaetigungAngaben <em>Bestaetigung Angaben</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bestaetigung Angaben</em>' containment reference.
	 * @see #getBestaetigungAngaben()
	 * @generated
	 */
	void setBestaetigungAngaben(BestaetigungAngabenType value);

	/**
	 * Returns the value of the '<em><b>Merkblatt UVG</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Dokumentiert die Kenntnisnahme und Bestätigung des UVG Merkblatts.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Merkblatt UVG</em>' attribute.
	 * @see #isSetMerkblattUVG()
	 * @see #unsetMerkblattUVG()
	 * @see #setMerkblattUVG(boolean)
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getUnterhaltsvorschussantragJaehrlicheUeberpruefung0302Type_MerkblattUVG()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='merkblattUVG' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isMerkblattUVG();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussantragJaehrlicheUeberpruefung0302Type#isMerkblattUVG <em>Merkblatt UVG</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Merkblatt UVG</em>' attribute.
	 * @see #isSetMerkblattUVG()
	 * @see #unsetMerkblattUVG()
	 * @see #isMerkblattUVG()
	 * @generated
	 */
	void setMerkblattUVG(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussantragJaehrlicheUeberpruefung0302Type#isMerkblattUVG <em>Merkblatt UVG</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMerkblattUVG()
	 * @see #isMerkblattUVG()
	 * @see #setMerkblattUVG(boolean)
	 * @generated
	 */
	void unsetMerkblattUVG();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussantragJaehrlicheUeberpruefung0302Type#isMerkblattUVG <em>Merkblatt UVG</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Merkblatt UVG</em>' attribute is set.
	 * @see #unsetMerkblattUVG()
	 * @see #isMerkblattUVG()
	 * @see #setMerkblattUVG(boolean)
	 * @generated
	 */
	boolean isSetMerkblattUVG();

} // UnterhaltsvorschussantragJaehrlicheUeberpruefung0302Type
