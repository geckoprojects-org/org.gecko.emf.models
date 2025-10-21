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
package de.xoev.xfamilie.baukasten._1.baukasten;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Kommunikationspartner Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Ein Kommunikationspartner in der Kommunikation über XFamilie (Autor oder Leser), beispielsweise eine Behörde oder eine andere öffentliche Stelle.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.KommunikationspartnerType#getBehoerdenkennung <em>Behoerdenkennung</em>}</li>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.KommunikationspartnerType#getErreichbarkeit <em>Erreichbarkeit</em>}</li>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.KommunikationspartnerType#getAnschrift <em>Anschrift</em>}</li>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.KommunikationspartnerType#getBehoerdenname <em>Behoerdenname</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.baukasten._1.baukasten.BaukastenPackage#getKommunikationspartnerType()
 * @model extendedMetaData="name='KommunikationspartnerType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface KommunikationspartnerType extends EObject {
	/**
	 * Returns the value of the '<em><b>Behoerdenkennung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Es wird die eindeutige Behördenkennung angegeben, über die die Behörde im DVDV ermittelt werden kann. Diese hier übermittelte Behördenkennung muss es dem Leser einer Nachricht ermöglichen, den Autor einer Nachricht im DVDV zu ermitteln um diesem ggf. erforderliche elektronische Mitteilungen senden zu können (bspw. Quittungen oder Fehlernachrichten).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Behoerdenkennung</em>' containment reference.
	 * @see #setBehoerdenkennung(BehoerdenkennungType)
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.BaukastenPackage#getKommunikationspartnerType_Behoerdenkennung()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='behoerdenkennung' namespace='##targetNamespace'"
	 * @generated
	 */
	BehoerdenkennungType getBehoerdenkennung();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.baukasten._1.baukasten.KommunikationspartnerType#getBehoerdenkennung <em>Behoerdenkennung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Behoerdenkennung</em>' containment reference.
	 * @see #getBehoerdenkennung()
	 * @generated
	 */
	void setBehoerdenkennung(BehoerdenkennungType value);

	/**
	 * Returns the value of the '<em><b>Erreichbarkeit</b></em>' containment reference list.
	 * The list contents are of type {@link de.xoev.xfamilie.baukasten._1.baukasten.ErreichbarkeitType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angaben zur Erreichbarkeit dieser Behörde per Telefon, Telefax, E-Mail etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Erreichbarkeit</em>' containment reference list.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.BaukastenPackage#getKommunikationspartnerType_Erreichbarkeit()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='erreichbarkeit' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ErreichbarkeitType> getErreichbarkeit();

	/**
	 * Returns the value of the '<em><b>Anschrift</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Die Anschrift dieser Behörde (für persönliches Erscheinen oder die Zusendung von Dokumenten per Briefpost an die Behörde).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Anschrift</em>' containment reference.
	 * @see #setAnschrift(PostalischeInlandsanschriftType)
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.BaukastenPackage#getKommunikationspartnerType_Anschrift()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='anschrift' namespace='##targetNamespace'"
	 * @generated
	 */
	PostalischeInlandsanschriftType getAnschrift();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.baukasten._1.baukasten.KommunikationspartnerType#getAnschrift <em>Anschrift</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Anschrift</em>' containment reference.
	 * @see #getAnschrift()
	 * @generated
	 */
	void setAnschrift(PostalischeInlandsanschriftType value);

	/**
	 * Returns the value of the '<em><b>Behoerdenname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Es ist der Name der Behörde zu übermitteln. Er dient auch dazu, eine ggfs. erforderliche manuelle Klärung zu beschleunigen, indem bspw. der Autor einer Nachricht im Klartext übermittelt, an welche Behörde er die Nachricht schicken wollte.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Behoerdenname</em>' attribute.
	 * @see #setBehoerdenname(String)
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.BaukastenPackage#getKommunikationspartnerType_Behoerdenname()
	 * @model dataType="de.xoev.kosit.datentyp._202204.din91379.DatatypeC" required="true"
	 *        extendedMetaData="kind='element' name='behoerdenname' namespace='##targetNamespace'"
	 * @generated
	 */
	String getBehoerdenname();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.baukasten._1.baukasten.KommunikationspartnerType#getBehoerdenname <em>Behoerdenname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Behoerdenname</em>' attribute.
	 * @see #getBehoerdenname()
	 * @generated
	 */
	void setBehoerdenname(String value);

} // KommunikationspartnerType
