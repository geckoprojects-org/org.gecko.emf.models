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
 * A representation of the model object '<em><b>Bestaetigung Angaben Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.BestaetigungAngabenType#isWahrheitsgemaesseAngaben <em>Wahrheitsgemaesse Angaben</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.BestaetigungAngabenType#isVerpflichtungAenderungsmitteilungen <em>Verpflichtung Aenderungsmitteilungen</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getBestaetigungAngabenType()
 * @model extendedMetaData="name='BestaetigungAngabenType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface BestaetigungAngabenType extends EObject {
	/**
	 * Returns the value of the '<em><b>Wahrheitsgemaesse Angaben</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bestätigung über wahrheitgemäße Angaben.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Wahrheitsgemaesse Angaben</em>' attribute.
	 * @see #isSetWahrheitsgemaesseAngaben()
	 * @see #unsetWahrheitsgemaesseAngaben()
	 * @see #setWahrheitsgemaesseAngaben(boolean)
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getBestaetigungAngabenType_WahrheitsgemaesseAngaben()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='wahrheitsgemaesseAngaben' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isWahrheitsgemaesseAngaben();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.BestaetigungAngabenType#isWahrheitsgemaesseAngaben <em>Wahrheitsgemaesse Angaben</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wahrheitsgemaesse Angaben</em>' attribute.
	 * @see #isSetWahrheitsgemaesseAngaben()
	 * @see #unsetWahrheitsgemaesseAngaben()
	 * @see #isWahrheitsgemaesseAngaben()
	 * @generated
	 */
	void setWahrheitsgemaesseAngaben(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.BestaetigungAngabenType#isWahrheitsgemaesseAngaben <em>Wahrheitsgemaesse Angaben</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWahrheitsgemaesseAngaben()
	 * @see #isWahrheitsgemaesseAngaben()
	 * @see #setWahrheitsgemaesseAngaben(boolean)
	 * @generated
	 */
	void unsetWahrheitsgemaesseAngaben();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.BestaetigungAngabenType#isWahrheitsgemaesseAngaben <em>Wahrheitsgemaesse Angaben</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Wahrheitsgemaesse Angaben</em>' attribute is set.
	 * @see #unsetWahrheitsgemaesseAngaben()
	 * @see #isWahrheitsgemaesseAngaben()
	 * @see #setWahrheitsgemaesseAngaben(boolean)
	 * @generated
	 */
	boolean isSetWahrheitsgemaesseAngaben();

	/**
	 * Returns the value of the '<em><b>Verpflichtung Aenderungsmitteilungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Versicherung über Verpflichtung der Angabe bei Änderungen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Verpflichtung Aenderungsmitteilungen</em>' attribute.
	 * @see #isSetVerpflichtungAenderungsmitteilungen()
	 * @see #unsetVerpflichtungAenderungsmitteilungen()
	 * @see #setVerpflichtungAenderungsmitteilungen(boolean)
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getBestaetigungAngabenType_VerpflichtungAenderungsmitteilungen()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='verpflichtungAenderungsmitteilungen' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isVerpflichtungAenderungsmitteilungen();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.BestaetigungAngabenType#isVerpflichtungAenderungsmitteilungen <em>Verpflichtung Aenderungsmitteilungen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Verpflichtung Aenderungsmitteilungen</em>' attribute.
	 * @see #isSetVerpflichtungAenderungsmitteilungen()
	 * @see #unsetVerpflichtungAenderungsmitteilungen()
	 * @see #isVerpflichtungAenderungsmitteilungen()
	 * @generated
	 */
	void setVerpflichtungAenderungsmitteilungen(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.BestaetigungAngabenType#isVerpflichtungAenderungsmitteilungen <em>Verpflichtung Aenderungsmitteilungen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVerpflichtungAenderungsmitteilungen()
	 * @see #isVerpflichtungAenderungsmitteilungen()
	 * @see #setVerpflichtungAenderungsmitteilungen(boolean)
	 * @generated
	 */
	void unsetVerpflichtungAenderungsmitteilungen();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.BestaetigungAngabenType#isVerpflichtungAenderungsmitteilungen <em>Verpflichtung Aenderungsmitteilungen</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Verpflichtung Aenderungsmitteilungen</em>' attribute is set.
	 * @see #unsetVerpflichtungAenderungsmitteilungen()
	 * @see #isVerpflichtungAenderungsmitteilungen()
	 * @see #setVerpflichtungAenderungsmitteilungen(boolean)
	 * @generated
	 */
	boolean isSetVerpflichtungAenderungsmitteilungen();

} // BestaetigungAngabenType
