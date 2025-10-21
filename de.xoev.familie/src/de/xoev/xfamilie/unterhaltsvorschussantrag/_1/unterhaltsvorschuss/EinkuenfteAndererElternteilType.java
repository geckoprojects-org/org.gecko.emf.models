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

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Einkuenfte Anderer Elternteil Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Daten zu Einkünften des anderen Elternteils.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.EinkuenfteAndererElternteilType#getArt <em>Art</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.EinkuenfteAndererElternteilType#getWeitereInformationen <em>Weitere Informationen</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.EinkuenfteAndererElternteilType#getBetragDerEinkuenfte <em>Betrag Der Einkuenfte</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getEinkuenfteAndererElternteilType()
 * @model extendedMetaData="name='Einkuenfte.AndererElternteilType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface EinkuenfteAndererElternteilType extends EObject {
	/**
	 * Returns the value of the '<em><b>Art</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Art der Einkünfte.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Art</em>' containment reference.
	 * @see #setArt(CodeEinkuenfteAndererElternteilType)
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getEinkuenfteAndererElternteilType_Art()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='art' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeEinkuenfteAndererElternteilType getArt();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.EinkuenfteAndererElternteilType#getArt <em>Art</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Art</em>' containment reference.
	 * @see #getArt()
	 * @generated
	 */
	void setArt(CodeEinkuenfteAndererElternteilType value);

	/**
	 * Returns the value of the '<em><b>Weitere Informationen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Hier können für verschiedene Arten der Einkünfte mehr Informationen übertragen werden. Regel: Wenn "Art" "nichtselbstaendige Beschaeftigung" ist, können Name und Branche des Arbeitgebers, Einsatzort und Firmensitz uebertragen werden. Wenn "Art" "selbstaendige Beschaeftigung" ist, können Art und Ort der Tätigkeit übertragen werden. Wenn "Art" "sonstige Einkuenfte" ist, können weitere Informationen aufgenommen werden.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Weitere Informationen</em>' attribute.
	 * @see #setWeitereInformationen(String)
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getEinkuenfteAndererElternteilType_WeitereInformationen()
	 * @model dataType="de.xoev.kosit.datentyp._202204.din91379.DatatypeC"
	 *        extendedMetaData="kind='element' name='weitereInformationen' namespace='##targetNamespace'"
	 * @generated
	 */
	String getWeitereInformationen();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.EinkuenfteAndererElternteilType#getWeitereInformationen <em>Weitere Informationen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weitere Informationen</em>' attribute.
	 * @see #getWeitereInformationen()
	 * @generated
	 */
	void setWeitereInformationen(String value);

	/**
	 * Returns the value of the '<em><b>Betrag Der Einkuenfte</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Daten für die jeweiligen Einkünfte der Höhe des Betrags.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Betrag Der Einkuenfte</em>' attribute.
	 * @see #setBetragDerEinkuenfte(String)
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getEinkuenfteAndererElternteilType_BetragDerEinkuenfte()
	 * @model dataType="de.xoev.kosit.datentyp._202204.din91379.DatatypeC"
	 *        extendedMetaData="kind='element' name='betragDerEinkuenfte' namespace='##targetNamespace'"
	 * @generated
	 */
	String getBetragDerEinkuenfte();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.EinkuenfteAndererElternteilType#getBetragDerEinkuenfte <em>Betrag Der Einkuenfte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Betrag Der Einkuenfte</em>' attribute.
	 * @see #getBetragDerEinkuenfte()
	 * @generated
	 */
	void setBetragDerEinkuenfte(String value);

} // EinkuenfteAndererElternteilType
