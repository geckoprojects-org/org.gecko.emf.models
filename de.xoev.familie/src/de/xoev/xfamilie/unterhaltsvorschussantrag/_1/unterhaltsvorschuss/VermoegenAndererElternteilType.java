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

import de.xoev.xfamilie.baukasten._1.baukasten.CodeVermoegensartType;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vermoegen Anderer Elternteil Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Daten zum Vermögen des anderen Elternteils.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.VermoegenAndererElternteilType#getArt <em>Art</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.VermoegenAndererElternteilType#getZusaetzlicheInformationen <em>Zusaetzliche Informationen</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getVermoegenAndererElternteilType()
 * @model extendedMetaData="name='Vermoegen.andererElternteilType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface VermoegenAndererElternteilType extends EObject {
	/**
	 * Returns the value of the '<em><b>Art</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Art des Vermögens.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Art</em>' containment reference.
	 * @see #setArt(CodeVermoegensartType)
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getVermoegenAndererElternteilType_Art()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='art' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeVermoegensartType getArt();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.VermoegenAndererElternteilType#getArt <em>Art</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Art</em>' containment reference.
	 * @see #getArt()
	 * @generated
	 */
	void setArt(CodeVermoegensartType value);

	/**
	 * Returns the value of the '<em><b>Zusaetzliche Informationen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Daten zu zusätzlichen Angaben zum Vermögen des anderen Elternteils. Regel: Je nach Literal können andere zusaetzliche Informationen mitgesendet werden. Fuer einige Literale der Codeliste gibt es spezifischere Inhalte der zusatzlichen Informationen. Fuer "Girokonto" kann der Name der Bank als zusaetzliche Information uebertragen werden; fuer "Kapitallebensversicherung" kann der name des Versicherungsunternehmens als zusaetzliche Information uebertragen werden; Fuer "Kraftfahrzeug" kann das KFZ-Kennzeichen als zusaetzliche Information uebertragen werden.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Zusaetzliche Informationen</em>' attribute.
	 * @see #setZusaetzlicheInformationen(String)
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getVermoegenAndererElternteilType_ZusaetzlicheInformationen()
	 * @model dataType="de.xoev.kosit.datentyp._202204.din91379.DatatypeC"
	 *        extendedMetaData="kind='element' name='zusaetzlicheInformationen' namespace='##targetNamespace'"
	 * @generated
	 */
	String getZusaetzlicheInformationen();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.VermoegenAndererElternteilType#getZusaetzlicheInformationen <em>Zusaetzliche Informationen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zusaetzliche Informationen</em>' attribute.
	 * @see #getZusaetzlicheInformationen()
	 * @generated
	 */
	void setZusaetzlicheInformationen(String value);

} // VermoegenAndererElternteilType
