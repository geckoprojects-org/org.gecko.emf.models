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
 * A representation of the model object '<em><b>Sonstige Leistung Anderer Elternteil Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Daten zu sonstigen Leistungen (z.B. SGB II) des anderen Elternteils.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.SonstigeLeistungAndererElternteilType#getArt <em>Art</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.SonstigeLeistungAndererElternteilType#getNameLeistungsstelle <em>Name Leistungsstelle</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.SonstigeLeistungAndererElternteilType#getBedarfsgemeinschaftsnummer <em>Bedarfsgemeinschaftsnummer</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.SonstigeLeistungAndererElternteilType#getRentenversicherungsnummer <em>Rentenversicherungsnummer</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.SonstigeLeistungAndererElternteilType#getBetraegeZurLeistungshoehe <em>Betraege Zur Leistungshoehe</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getSonstigeLeistungAndererElternteilType()
 * @model extendedMetaData="name='SonstigeLeistung.andererElternteilType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface SonstigeLeistungAndererElternteilType extends EObject {
	/**
	 * Returns the value of the '<em><b>Art</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Art der sonstigen Leistung.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Art</em>' containment reference.
	 * @see #setArt(CodeSonstigeLeistungenUVType)
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getSonstigeLeistungAndererElternteilType_Art()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='art' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeSonstigeLeistungenUVType getArt();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.SonstigeLeistungAndererElternteilType#getArt <em>Art</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Art</em>' containment reference.
	 * @see #getArt()
	 * @generated
	 */
	void setArt(CodeSonstigeLeistungenUVType value);

	/**
	 * Returns the value of the '<em><b>Name Leistungsstelle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Daten zum Namen der Leistungsstelle.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name Leistungsstelle</em>' attribute.
	 * @see #setNameLeistungsstelle(String)
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getSonstigeLeistungAndererElternteilType_NameLeistungsstelle()
	 * @model dataType="de.xoev.kosit.datentyp._202204.din91379.DatatypeC"
	 *        extendedMetaData="kind='element' name='nameLeistungsstelle' namespace='##targetNamespace'"
	 * @generated
	 */
	String getNameLeistungsstelle();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.SonstigeLeistungAndererElternteilType#getNameLeistungsstelle <em>Name Leistungsstelle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Leistungsstelle</em>' attribute.
	 * @see #getNameLeistungsstelle()
	 * @generated
	 */
	void setNameLeistungsstelle(String value);

	/**
	 * Returns the value of the '<em><b>Bedarfsgemeinschaftsnummer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Daten für die Leistungen nach SGB II eine Übertragung der Bedarfsgemeinschaftnummer. Regel: Falls "Art" "SGB II" ist.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bedarfsgemeinschaftsnummer</em>' attribute.
	 * @see #setBedarfsgemeinschaftsnummer(String)
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getSonstigeLeistungAndererElternteilType_Bedarfsgemeinschaftsnummer()
	 * @model dataType="de.xoev.kosit.datentyp._202204.din91379.DatatypeC"
	 *        extendedMetaData="kind='element' name='bedarfsgemeinschaftsnummer' namespace='##targetNamespace'"
	 * @generated
	 */
	String getBedarfsgemeinschaftsnummer();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.SonstigeLeistungAndererElternteilType#getBedarfsgemeinschaftsnummer <em>Bedarfsgemeinschaftsnummer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bedarfsgemeinschaftsnummer</em>' attribute.
	 * @see #getBedarfsgemeinschaftsnummer()
	 * @generated
	 */
	void setBedarfsgemeinschaftsnummer(String value);

	/**
	 * Returns the value of the '<em><b>Rentenversicherungsnummer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Datum zu der Rentenversicherungsnummer. Regel: Falls "Art" "Rente" ist.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rentenversicherungsnummer</em>' attribute.
	 * @see #setRentenversicherungsnummer(String)
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getSonstigeLeistungAndererElternteilType_Rentenversicherungsnummer()
	 * @model dataType="de.xoev.kosit.datentyp._202204.din91379.DatatypeC"
	 *        extendedMetaData="kind='element' name='rentenversicherungsnummer' namespace='##targetNamespace'"
	 * @generated
	 */
	String getRentenversicherungsnummer();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.SonstigeLeistungAndererElternteilType#getRentenversicherungsnummer <em>Rentenversicherungsnummer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rentenversicherungsnummer</em>' attribute.
	 * @see #getRentenversicherungsnummer()
	 * @generated
	 */
	void setRentenversicherungsnummer(String value);

	/**
	 * Returns the value of the '<em><b>Betraege Zur Leistungshoehe</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Daten für den jeweiligen Betrag der Leistung.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Betraege Zur Leistungshoehe</em>' attribute.
	 * @see #setBetraegeZurLeistungshoehe(String)
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getSonstigeLeistungAndererElternteilType_BetraegeZurLeistungshoehe()
	 * @model dataType="de.xoev.kosit.datentyp._202204.din91379.DatatypeC"
	 *        extendedMetaData="kind='element' name='betraegeZurLeistungshoehe' namespace='##targetNamespace'"
	 * @generated
	 */
	String getBetraegeZurLeistungshoehe();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.SonstigeLeistungAndererElternteilType#getBetraegeZurLeistungshoehe <em>Betraege Zur Leistungshoehe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Betraege Zur Leistungshoehe</em>' attribute.
	 * @see #getBetraegeZurLeistungshoehe()
	 * @generated
	 */
	void setBetraegeZurLeistungshoehe(String value);

} // SonstigeLeistungAndererElternteilType
