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

import de.xoev.xfamilie.baukasten._1.baukasten.AntragsnachrichtType;
import de.xoev.xfamilie.baukasten._1.baukasten.DatenschutzerklaerungenType;
import de.xoev.xfamilie.baukasten._1.baukasten.NachweisdokumentType;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Antrag0601 Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftAntrag0601Type#getAnliegensklaerung <em>Anliegensklaerung</em>}</li>
 *   <li>{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftAntrag0601Type#getAntragstellenderElternteil <em>Antragstellender Elternteil</em>}</li>
 *   <li>{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftAntrag0601Type#getAngabenZumKind <em>Angaben Zum Kind</em>}</li>
 *   <li>{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftAntrag0601Type#getAngabenZumAnderenElternteil <em>Angaben Zum Anderen Elternteil</em>}</li>
 *   <li>{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftAntrag0601Type#getAngabenZumUnterhalt <em>Angaben Zum Unterhalt</em>}</li>
 *   <li>{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftAntrag0601Type#getNachweise <em>Nachweise</em>}</li>
 *   <li>{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftAntrag0601Type#isWartenAufUnterschrift <em>Warten Auf Unterschrift</em>}</li>
 *   <li>{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftAntrag0601Type#getDsgvo <em>Dsgvo</em>}</li>
 *   <li>{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftAntrag0601Type#isRichtigkeitDerAngaben <em>Richtigkeit Der Angaben</em>}</li>
 *   <li>{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftAntrag0601Type#getPdfAntrag <em>Pdf Antrag</em>}</li>
 *   <li>{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftAntrag0601Type#isMerkblattUVG <em>Merkblatt UVG</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftPackage#getBeistandschaftAntrag0601Type()
 * @model extendedMetaData="name='beistandschaft.antrag.0601_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface BeistandschaftAntrag0601Type extends AntragsnachrichtType {
	/**
	 * Returns the value of the '<em><b>Anliegensklaerung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * In diesem Element wird geklärt, um welches Anliegen es im Antrag geht.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Anliegensklaerung</em>' containment reference.
	 * @see #setAnliegensklaerung(AnliegensklaerungBSSType)
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftPackage#getBeistandschaftAntrag0601Type_Anliegensklaerung()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='anliegensklaerung' namespace='##targetNamespace'"
	 * @generated
	 */
	AnliegensklaerungBSSType getAnliegensklaerung();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftAntrag0601Type#getAnliegensklaerung <em>Anliegensklaerung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Anliegensklaerung</em>' containment reference.
	 * @see #getAnliegensklaerung()
	 * @generated
	 */
	void setAnliegensklaerung(AnliegensklaerungBSSType value);

	/**
	 * Returns the value of the '<em><b>Antragstellender Elternteil</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angaben zum antragstellenden Elternteil
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Antragstellender Elternteil</em>' containment reference.
	 * @see #setAntragstellenderElternteil(AntragstellenderElternteilType)
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftPackage#getBeistandschaftAntrag0601Type_AntragstellenderElternteil()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='antragstellenderElternteil' namespace='##targetNamespace'"
	 * @generated
	 */
	AntragstellenderElternteilType getAntragstellenderElternteil();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftAntrag0601Type#getAntragstellenderElternteil <em>Antragstellender Elternteil</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Antragstellender Elternteil</em>' containment reference.
	 * @see #getAntragstellenderElternteil()
	 * @generated
	 */
	void setAntragstellenderElternteil(AntragstellenderElternteilType value);

	/**
	 * Returns the value of the '<em><b>Angaben Zum Kind</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angaben zum Kind.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Angaben Zum Kind</em>' containment reference.
	 * @see #setAngabenZumKind(AngabenZumKindType)
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftPackage#getBeistandschaftAntrag0601Type_AngabenZumKind()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='angabenZumKind' namespace='##targetNamespace'"
	 * @generated
	 */
	AngabenZumKindType getAngabenZumKind();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftAntrag0601Type#getAngabenZumKind <em>Angaben Zum Kind</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Angaben Zum Kind</em>' containment reference.
	 * @see #getAngabenZumKind()
	 * @generated
	 */
	void setAngabenZumKind(AngabenZumKindType value);

	/**
	 * Returns the value of the '<em><b>Angaben Zum Anderen Elternteil</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angaben zum anderen Elternteil.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Angaben Zum Anderen Elternteil</em>' containment reference.
	 * @see #setAngabenZumAnderenElternteil(AndererElternteilType)
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftPackage#getBeistandschaftAntrag0601Type_AngabenZumAnderenElternteil()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='angabenZumAnderenElternteil' namespace='##targetNamespace'"
	 * @generated
	 */
	AndererElternteilType getAngabenZumAnderenElternteil();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftAntrag0601Type#getAngabenZumAnderenElternteil <em>Angaben Zum Anderen Elternteil</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Angaben Zum Anderen Elternteil</em>' containment reference.
	 * @see #getAngabenZumAnderenElternteil()
	 * @generated
	 */
	void setAngabenZumAnderenElternteil(AndererElternteilType value);

	/**
	 * Returns the value of the '<em><b>Angaben Zum Unterhalt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Die Angaben zum Unterhalt. Das Element ist nur zu befüllen, wenn für anliegenBeistandschaft u oder vu gewählt wurde.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Angaben Zum Unterhalt</em>' containment reference.
	 * @see #setAngabenZumUnterhalt(AngabenZumUnterhaltType)
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftPackage#getBeistandschaftAntrag0601Type_AngabenZumUnterhalt()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='angabenZumUnterhalt' namespace='##targetNamespace'"
	 * @generated
	 */
	AngabenZumUnterhaltType getAngabenZumUnterhalt();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftAntrag0601Type#getAngabenZumUnterhalt <em>Angaben Zum Unterhalt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Angaben Zum Unterhalt</em>' containment reference.
	 * @see #getAngabenZumUnterhalt()
	 * @generated
	 */
	void setAngabenZumUnterhalt(AngabenZumUnterhaltType value);

	/**
	 * Returns the value of the '<em><b>Nachweise</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nachweise</em>' containment reference.
	 * @see #setNachweise(NachweiseBSSType)
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftPackage#getBeistandschaftAntrag0601Type_Nachweise()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='nachweise' namespace='##targetNamespace'"
	 * @generated
	 */
	NachweiseBSSType getNachweise();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftAntrag0601Type#getNachweise <em>Nachweise</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nachweise</em>' containment reference.
	 * @see #getNachweise()
	 * @generated
	 */
	void setNachweise(NachweiseBSSType value);

	/**
	 * Returns the value of the '<em><b>Warten Auf Unterschrift</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angabe, ob noch auf Unterschrit gewartet werden muss.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Warten Auf Unterschrift</em>' attribute.
	 * @see #isSetWartenAufUnterschrift()
	 * @see #unsetWartenAufUnterschrift()
	 * @see #setWartenAufUnterschrift(boolean)
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftPackage#getBeistandschaftAntrag0601Type_WartenAufUnterschrift()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='wartenAufUnterschrift' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isWartenAufUnterschrift();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftAntrag0601Type#isWartenAufUnterschrift <em>Warten Auf Unterschrift</em>}' attribute.
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
	 * Unsets the value of the '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftAntrag0601Type#isWartenAufUnterschrift <em>Warten Auf Unterschrift</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWartenAufUnterschrift()
	 * @see #isWartenAufUnterschrift()
	 * @see #setWartenAufUnterschrift(boolean)
	 * @generated
	 */
	void unsetWartenAufUnterschrift();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftAntrag0601Type#isWartenAufUnterschrift <em>Warten Auf Unterschrift</em>}' attribute is set.
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
	 * Angabe, ob noch auf Unterschrit gewartet werden muss.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dsgvo</em>' containment reference.
	 * @see #setDsgvo(DatenschutzerklaerungenType)
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftPackage#getBeistandschaftAntrag0601Type_Dsgvo()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='dsgvo' namespace='##targetNamespace'"
	 * @generated
	 */
	DatenschutzerklaerungenType getDsgvo();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftAntrag0601Type#getDsgvo <em>Dsgvo</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dsgvo</em>' containment reference.
	 * @see #getDsgvo()
	 * @generated
	 */
	void setDsgvo(DatenschutzerklaerungenType value);

	/**
	 * Returns the value of the '<em><b>Richtigkeit Der Angaben</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Richtigkeit Der Angaben</em>' attribute.
	 * @see #isSetRichtigkeitDerAngaben()
	 * @see #unsetRichtigkeitDerAngaben()
	 * @see #setRichtigkeitDerAngaben(boolean)
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftPackage#getBeistandschaftAntrag0601Type_RichtigkeitDerAngaben()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='richtigkeitDerAngaben' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isRichtigkeitDerAngaben();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftAntrag0601Type#isRichtigkeitDerAngaben <em>Richtigkeit Der Angaben</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Richtigkeit Der Angaben</em>' attribute.
	 * @see #isSetRichtigkeitDerAngaben()
	 * @see #unsetRichtigkeitDerAngaben()
	 * @see #isRichtigkeitDerAngaben()
	 * @generated
	 */
	void setRichtigkeitDerAngaben(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftAntrag0601Type#isRichtigkeitDerAngaben <em>Richtigkeit Der Angaben</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRichtigkeitDerAngaben()
	 * @see #isRichtigkeitDerAngaben()
	 * @see #setRichtigkeitDerAngaben(boolean)
	 * @generated
	 */
	void unsetRichtigkeitDerAngaben();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftAntrag0601Type#isRichtigkeitDerAngaben <em>Richtigkeit Der Angaben</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Richtigkeit Der Angaben</em>' attribute is set.
	 * @see #unsetRichtigkeitDerAngaben()
	 * @see #isRichtigkeitDerAngaben()
	 * @see #setRichtigkeitDerAngaben(boolean)
	 * @generated
	 */
	boolean isSetRichtigkeitDerAngaben();

	/**
	 * Returns the value of the '<em><b>Pdf Antrag</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Mit diesem Element ist es möglich, den Antrag im PDF anzuhängen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pdf Antrag</em>' containment reference.
	 * @see #setPdfAntrag(NachweisdokumentType)
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftPackage#getBeistandschaftAntrag0601Type_PdfAntrag()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='pdfAntrag' namespace='##targetNamespace'"
	 * @generated
	 */
	NachweisdokumentType getPdfAntrag();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftAntrag0601Type#getPdfAntrag <em>Pdf Antrag</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pdf Antrag</em>' containment reference.
	 * @see #getPdfAntrag()
	 * @generated
	 */
	void setPdfAntrag(NachweisdokumentType value);

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
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftPackage#getBeistandschaftAntrag0601Type_MerkblattUVG()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='merkblattUVG' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isMerkblattUVG();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftAntrag0601Type#isMerkblattUVG <em>Merkblatt UVG</em>}' attribute.
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
	 * Unsets the value of the '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftAntrag0601Type#isMerkblattUVG <em>Merkblatt UVG</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMerkblattUVG()
	 * @see #isMerkblattUVG()
	 * @see #setMerkblattUVG(boolean)
	 * @generated
	 */
	void unsetMerkblattUVG();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftAntrag0601Type#isMerkblattUVG <em>Merkblatt UVG</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Merkblatt UVG</em>' attribute is set.
	 * @see #unsetMerkblattUVG()
	 * @see #isMerkblattUVG()
	 * @see #setMerkblattUVG(boolean)
	 * @generated
	 */
	boolean isSetMerkblattUVG();

} // BeistandschaftAntrag0601Type
