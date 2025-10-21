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
import de.xoev.xfamilie.baukasten._1.baukasten.DatenschutzerklaerungenType;
import de.xoev.xfamilie.baukasten._1.baukasten.NachweisdokumentType;

import org.eclipse.emf.common.util.EList;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unterhaltsvorschussantrag Nachreichen0303 Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussantragNachreichen0303Type#getFallnummerUVO <em>Fallnummer UVO</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussantragNachreichen0303Type#getAngabenKindNachreichen <em>Angaben Kind Nachreichen</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussantragNachreichen0303Type#getAenderungsmitteilung <em>Aenderungsmitteilung</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussantragNachreichen0303Type#getNachzureichendesDokument <em>Nachzureichendes Dokument</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussantragNachreichen0303Type#getDsgvo <em>Dsgvo</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussantragNachreichen0303Type#isArtSignaturDigital <em>Art Signatur Digital</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussantragNachreichen0303Type#getBestaetigungAngaben <em>Bestaetigung Angaben</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussantragNachreichen0303Type#isMerkblattUVG <em>Merkblatt UVG</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getUnterhaltsvorschussantragNachreichen0303Type()
 * @model extendedMetaData="name='unterhaltsvorschussantrag.nachreichen.0303_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface UnterhaltsvorschussantragNachreichen0303Type extends AntragsnachrichtType {
	/**
	 * Returns the value of the '<em><b>Fallnummer UVO</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * UVO-Bearbeitungs- bzw. -Fallnummer, auf die sich die Nachreichung bezieht.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fallnummer UVO</em>' attribute.
	 * @see #setFallnummerUVO(String)
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getUnterhaltsvorschussantragNachreichen0303Type_FallnummerUVO()
	 * @model dataType="de.xoev.kosit.datentyp._202204.din91379.DatatypeC"
	 *        extendedMetaData="kind='element' name='fallnummerUVO' namespace='##targetNamespace'"
	 * @generated
	 */
	String getFallnummerUVO();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussantragNachreichen0303Type#getFallnummerUVO <em>Fallnummer UVO</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fallnummer UVO</em>' attribute.
	 * @see #getFallnummerUVO()
	 * @generated
	 */
	void setFallnummerUVO(String value);

	/**
	 * Returns the value of the '<em><b>Angaben Kind Nachreichen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angaben zum Kind, die beim Nachreichen von Informationen gemacht werden müssen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Angaben Kind Nachreichen</em>' containment reference.
	 * @see #setAngabenKindNachreichen(AngabenKindNachreichenType)
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getUnterhaltsvorschussantragNachreichen0303Type_AngabenKindNachreichen()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='angabenKindNachreichen' namespace='##targetNamespace'"
	 * @generated
	 */
	AngabenKindNachreichenType getAngabenKindNachreichen();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussantragNachreichen0303Type#getAngabenKindNachreichen <em>Angaben Kind Nachreichen</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Angaben Kind Nachreichen</em>' containment reference.
	 * @see #getAngabenKindNachreichen()
	 * @generated
	 */
	void setAngabenKindNachreichen(AngabenKindNachreichenType value);

	/**
	 * Returns the value of the '<em><b>Aenderungsmitteilung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Freitextfeld für eine Änderungsmitteilung durch den/die Antragsteller:in.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Aenderungsmitteilung</em>' attribute.
	 * @see #setAenderungsmitteilung(String)
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getUnterhaltsvorschussantragNachreichen0303Type_Aenderungsmitteilung()
	 * @model dataType="de.xoev.kosit.datentyp._202204.din91379.DatatypeC"
	 *        extendedMetaData="kind='element' name='aenderungsmitteilung' namespace='##targetNamespace'"
	 * @generated
	 */
	String getAenderungsmitteilung();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussantragNachreichen0303Type#getAenderungsmitteilung <em>Aenderungsmitteilung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aenderungsmitteilung</em>' attribute.
	 * @see #getAenderungsmitteilung()
	 * @generated
	 */
	void setAenderungsmitteilung(String value);

	/**
	 * Returns the value of the '<em><b>Nachzureichendes Dokument</b></em>' containment reference list.
	 * The list contents are of type {@link de.xoev.xfamilie.baukasten._1.baukasten.NachweisdokumentType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Dokumentenupload (bspw. nachgereichte Nachweise).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nachzureichendes Dokument</em>' containment reference list.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getUnterhaltsvorschussantragNachreichen0303Type_NachzureichendesDokument()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='nachzureichendesDokument' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<NachweisdokumentType> getNachzureichendesDokument();

	/**
	 * Returns the value of the '<em><b>Dsgvo</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bestätigung zur Datenschutzerklärung des Dienst-betreibenden Landes sowie zur spezifischen Datenschutzerklärung des nachnutzenden Landes oder der nachnutzenden Kommune.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dsgvo</em>' containment reference.
	 * @see #setDsgvo(DatenschutzerklaerungenType)
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getUnterhaltsvorschussantragNachreichen0303Type_Dsgvo()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='dsgvo' namespace='##targetNamespace'"
	 * @generated
	 */
	DatenschutzerklaerungenType getDsgvo();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussantragNachreichen0303Type#getDsgvo <em>Dsgvo</em>}' containment reference.
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
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getUnterhaltsvorschussantragNachreichen0303Type_ArtSignaturDigital()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='artSignaturDigital' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isArtSignaturDigital();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussantragNachreichen0303Type#isArtSignaturDigital <em>Art Signatur Digital</em>}' attribute.
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
	 * Unsets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussantragNachreichen0303Type#isArtSignaturDigital <em>Art Signatur Digital</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetArtSignaturDigital()
	 * @see #isArtSignaturDigital()
	 * @see #setArtSignaturDigital(boolean)
	 * @generated
	 */
	void unsetArtSignaturDigital();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussantragNachreichen0303Type#isArtSignaturDigital <em>Art Signatur Digital</em>}' attribute is set.
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
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getUnterhaltsvorschussantragNachreichen0303Type_BestaetigungAngaben()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='bestaetigungAngaben' namespace='##targetNamespace'"
	 * @generated
	 */
	BestaetigungAngabenType getBestaetigungAngaben();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussantragNachreichen0303Type#getBestaetigungAngaben <em>Bestaetigung Angaben</em>}' containment reference.
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
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getUnterhaltsvorschussantragNachreichen0303Type_MerkblattUVG()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='merkblattUVG' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isMerkblattUVG();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussantragNachreichen0303Type#isMerkblattUVG <em>Merkblatt UVG</em>}' attribute.
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
	 * Unsets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussantragNachreichen0303Type#isMerkblattUVG <em>Merkblatt UVG</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMerkblattUVG()
	 * @see #isMerkblattUVG()
	 * @see #setMerkblattUVG(boolean)
	 * @generated
	 */
	void unsetMerkblattUVG();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussantragNachreichen0303Type#isMerkblattUVG <em>Merkblatt UVG</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Merkblatt UVG</em>' attribute is set.
	 * @see #unsetMerkblattUVG()
	 * @see #isMerkblattUVG()
	 * @see #setMerkblattUVG(boolean)
	 * @generated
	 */
	boolean isSetMerkblattUVG();

} // UnterhaltsvorschussantragNachreichen0303Type
