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

import de.xoev.xfamilie.baukasten._1.baukasten.NachrichtType;
import de.xoev.xfamilie.baukasten._1.baukasten.NachweisdokumentType;

import java.math.BigInteger;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unterhaltsvorschussantrag Nachweisnachricht0311 Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussantragNachweisnachricht0311Type#getNachweis <em>Nachweis</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussantragNachweisnachricht0311Type#getZugehoerigerAntrag <em>Zugehoeriger Antrag</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussantragNachweisnachricht0311Type#getGesamtZahlDerNachrichten <em>Gesamt Zahl Der Nachrichten</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussantragNachweisnachricht0311Type#isArtSignaturDigital <em>Art Signatur Digital</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussantragNachweisnachricht0311Type#getBestaetigungAngaben <em>Bestaetigung Angaben</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussantragNachweisnachricht0311Type#isMerkblattUVG <em>Merkblatt UVG</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getUnterhaltsvorschussantragNachweisnachricht0311Type()
 * @model extendedMetaData="name='unterhaltsvorschussantrag.nachweisnachricht.0311_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface UnterhaltsvorschussantragNachweisnachricht0311Type extends NachrichtType {
	/**
	 * Returns the value of the '<em><b>Nachweis</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Hier wird Informationen zum Nachweis und der Nachweis selbst übertragen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nachweis</em>' containment reference.
	 * @see #setNachweis(NachweisdokumentType)
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getUnterhaltsvorschussantragNachweisnachricht0311Type_Nachweis()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='nachweis' namespace='##targetNamespace'"
	 * @generated
	 */
	NachweisdokumentType getNachweis();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussantragNachweisnachricht0311Type#getNachweis <em>Nachweis</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nachweis</em>' containment reference.
	 * @see #getNachweis()
	 * @generated
	 */
	void setNachweis(NachweisdokumentType value);

	/**
	 * Returns the value of the '<em><b>Zugehoeriger Antrag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Hier ist die UUID anzugeben, die dem Antrag zugewiesen wurde, für den dieser Nachweis erbracht wird. Gibt es mehrere Nachweisnachrichten, die zu ein und demselben Antrag gehoeren, ist bei all diesen Nachweisnachrichten dieses Element identisch zu befüllen, damit die Empfänger Antragsnachricht und Nachweise eineindeutig zuordnen können.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Zugehoeriger Antrag</em>' attribute.
	 * @see #setZugehoerigerAntrag(String)
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getUnterhaltsvorschussantragNachweisnachricht0311Type_ZugehoerigerAntrag()
	 * @model dataType="de.xoev.xfamilie.baukasten._1.baukasten.UUIDType" required="true"
	 *        extendedMetaData="kind='element' name='zugehoerigerAntrag' namespace='##targetNamespace'"
	 * @generated
	 */
	String getZugehoerigerAntrag();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussantragNachweisnachricht0311Type#getZugehoerigerAntrag <em>Zugehoeriger Antrag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zugehoeriger Antrag</em>' attribute.
	 * @see #getZugehoerigerAntrag()
	 * @generated
	 */
	void setZugehoerigerAntrag(String value);

	/**
	 * Returns the value of the '<em><b>Gesamt Zahl Der Nachrichten</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Hiermit wird die Gesamtzahl der zu erwartenden Nachrichten übersandt.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Gesamt Zahl Der Nachrichten</em>' attribute.
	 * @see #setGesamtZahlDerNachrichten(BigInteger)
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getUnterhaltsvorschussantragNachweisnachricht0311Type_GesamtZahlDerNachrichten()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NonNegativeInteger" required="true"
	 *        extendedMetaData="kind='element' name='gesamtZahlDerNachrichten' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getGesamtZahlDerNachrichten();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussantragNachweisnachricht0311Type#getGesamtZahlDerNachrichten <em>Gesamt Zahl Der Nachrichten</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gesamt Zahl Der Nachrichten</em>' attribute.
	 * @see #getGesamtZahlDerNachrichten()
	 * @generated
	 */
	void setGesamtZahlDerNachrichten(BigInteger value);

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
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getUnterhaltsvorschussantragNachweisnachricht0311Type_ArtSignaturDigital()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='artSignaturDigital' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isArtSignaturDigital();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussantragNachweisnachricht0311Type#isArtSignaturDigital <em>Art Signatur Digital</em>}' attribute.
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
	 * Unsets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussantragNachweisnachricht0311Type#isArtSignaturDigital <em>Art Signatur Digital</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetArtSignaturDigital()
	 * @see #isArtSignaturDigital()
	 * @see #setArtSignaturDigital(boolean)
	 * @generated
	 */
	void unsetArtSignaturDigital();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussantragNachweisnachricht0311Type#isArtSignaturDigital <em>Art Signatur Digital</em>}' attribute is set.
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
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getUnterhaltsvorschussantragNachweisnachricht0311Type_BestaetigungAngaben()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='bestaetigungAngaben' namespace='##targetNamespace'"
	 * @generated
	 */
	BestaetigungAngabenType getBestaetigungAngaben();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussantragNachweisnachricht0311Type#getBestaetigungAngaben <em>Bestaetigung Angaben</em>}' containment reference.
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
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getUnterhaltsvorschussantragNachweisnachricht0311Type_MerkblattUVG()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='merkblattUVG' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isMerkblattUVG();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussantragNachweisnachricht0311Type#isMerkblattUVG <em>Merkblatt UVG</em>}' attribute.
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
	 * Unsets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussantragNachweisnachricht0311Type#isMerkblattUVG <em>Merkblatt UVG</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMerkblattUVG()
	 * @see #isMerkblattUVG()
	 * @see #setMerkblattUVG(boolean)
	 * @generated
	 */
	void unsetMerkblattUVG();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussantragNachweisnachricht0311Type#isMerkblattUVG <em>Merkblatt UVG</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Merkblatt UVG</em>' attribute is set.
	 * @see #unsetMerkblattUVG()
	 * @see #isMerkblattUVG()
	 * @see #setMerkblattUVG(boolean)
	 * @generated
	 */
	boolean isSetMerkblattUVG();

} // UnterhaltsvorschussantragNachweisnachricht0311Type
