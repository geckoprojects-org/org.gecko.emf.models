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

import de.xoev.xfamilie.baukasten._1.baukasten.CodeVertretungType;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vertretung Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Datentyp zur Vertretung. Nicht alle Arten der Vertretungen sind für alle Elternelemente zu benutzen.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.VertretungType#getArt <em>Art</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.VertretungType#getVormund <em>Vormund</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.VertretungType#getBeistand <em>Beistand</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.VertretungType#getAmtspflegschaft <em>Amtspflegschaft</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.VertretungType#getRechtsanwalt <em>Rechtsanwalt</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.VertretungType#getBetreuer <em>Betreuer</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.VertretungType#getOrganisationsname <em>Organisationsname</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getVertretungType()
 * @model extendedMetaData="name='VertretungType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface VertretungType extends EObject {
	/**
	 * Returns the value of the '<em><b>Art</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Art der Vertretung. Regel: Fuer das Antragskind sind zulaessige Literale "Beistand", "Vormund", "Amtspflegende", "Rechtsanwalt" und "keine Vertretung dieser Art". Fuer den antragstellenden Elternteil sind zulaessige Literale "Betreuer", "Vormund" und "keine Vertretung dieser Art" . Fuer der Anderen Elternteil sind zulaessige Literale "Betreuer", "Vormund", "keine Vertretung dieser Art" und "nicht bekannt".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Art</em>' containment reference.
	 * @see #setArt(CodeVertretungType)
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getVertretungType_Art()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='art' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeVertretungType getArt();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.VertretungType#getArt <em>Art</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Art</em>' containment reference.
	 * @see #getArt()
	 * @generated
	 */
	void setArt(CodeVertretungType value);

	/**
	 * Returns the value of the '<em><b>Vormund</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Daten zum Vormund. Regel: Falls "Art" "Vormund" ist.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vormund</em>' containment reference.
	 * @see #setVormund(VormundType)
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getVertretungType_Vormund()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='vormund' namespace='##targetNamespace'"
	 * @generated
	 */
	VormundType getVormund();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.VertretungType#getVormund <em>Vormund</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vormund</em>' containment reference.
	 * @see #getVormund()
	 * @generated
	 */
	void setVormund(VormundType value);

	/**
	 * Returns the value of the '<em><b>Beistand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Daten zum Beistand. Regel: Falls "Art" "Beistand" ist.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Beistand</em>' containment reference.
	 * @see #setBeistand(BeistandType)
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getVertretungType_Beistand()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='beistand' namespace='##targetNamespace'"
	 * @generated
	 */
	BeistandType getBeistand();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.VertretungType#getBeistand <em>Beistand</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Beistand</em>' containment reference.
	 * @see #getBeistand()
	 * @generated
	 */
	void setBeistand(BeistandType value);

	/**
	 * Returns the value of the '<em><b>Amtspflegschaft</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Daten zur Amtspflegschaft. Regel: Falls "Art" "Amtspflegschaft" ist.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Amtspflegschaft</em>' containment reference.
	 * @see #setAmtspflegschaft(AmtspflegendeType)
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getVertretungType_Amtspflegschaft()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='amtspflegschaft' namespace='##targetNamespace'"
	 * @generated
	 */
	AmtspflegendeType getAmtspflegschaft();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.VertretungType#getAmtspflegschaft <em>Amtspflegschaft</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amtspflegschaft</em>' containment reference.
	 * @see #getAmtspflegschaft()
	 * @generated
	 */
	void setAmtspflegschaft(AmtspflegendeType value);

	/**
	 * Returns the value of the '<em><b>Rechtsanwalt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Daten zum Rechtsanwalt. Regel: Falls "Art" "Rechtsanwalt" ist.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rechtsanwalt</em>' containment reference.
	 * @see #setRechtsanwalt(RechtsanwaltType)
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getVertretungType_Rechtsanwalt()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='rechtsanwalt' namespace='##targetNamespace'"
	 * @generated
	 */
	RechtsanwaltType getRechtsanwalt();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.VertretungType#getRechtsanwalt <em>Rechtsanwalt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rechtsanwalt</em>' containment reference.
	 * @see #getRechtsanwalt()
	 * @generated
	 */
	void setRechtsanwalt(RechtsanwaltType value);

	/**
	 * Returns the value of the '<em><b>Betreuer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Daten zum Betreuer. Regel: Falls "Art" "Betreuer" ist.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Betreuer</em>' containment reference.
	 * @see #setBetreuer(BetreuerType)
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getVertretungType_Betreuer()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='betreuer' namespace='##targetNamespace'"
	 * @generated
	 */
	BetreuerType getBetreuer();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.VertretungType#getBetreuer <em>Betreuer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Betreuer</em>' containment reference.
	 * @see #getBetreuer()
	 * @generated
	 */
	void setBetreuer(BetreuerType value);

	/**
	 * Returns the value of the '<em><b>Organisationsname</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Datum zu genaueren Bestimmung der Organisation, in der die "Vertretung" arbeitet. So kann für jede "art" der "Vertretung" eine Organisationsname mitgegeben werden.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Organisationsname</em>' attribute list.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getVertretungType_Organisationsname()
	 * @model unique="false" dataType="de.xoev.kosit.datentyp._202204.din91379.DatatypeC"
	 *        extendedMetaData="kind='element' name='organisationsname' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getOrganisationsname();

} // VertretungType
