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

import de.xoev.xfamilie.baukasten._1.baukasten.CodeTatsachenbehauptungType;
import de.xoev.xfamilie.baukasten._1.baukasten.TeilbekanntesDatumType;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Weitere Kinder Anderer Elternteil Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Daten zu weiteren Kinder des anderen Elternteils.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.WeitereKinderAndererElternteilType#getName <em>Name</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.WeitereKinderAndererElternteilType#getGeburtsdatum <em>Geburtsdatum</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.WeitereKinderAndererElternteilType#getWohnhaftBeimAnderenElternteil <em>Wohnhaft Beim Anderen Elternteil</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getWeitereKinderAndererElternteilType()
 * @model extendedMetaData="name='WeitereKinder.AndererElternteilType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface WeitereKinderAndererElternteilType extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Name des Kindes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(NameOptionalType)
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getWeitereKinderAndererElternteilType_Name()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	NameOptionalType getName();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.WeitereKinderAndererElternteilType#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(NameOptionalType value);

	/**
	 * Returns the value of the '<em><b>Geburtsdatum</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Geburtsdatum des Kindes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Geburtsdatum</em>' containment reference.
	 * @see #setGeburtsdatum(TeilbekanntesDatumType)
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getWeitereKinderAndererElternteilType_Geburtsdatum()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='geburtsdatum' namespace='##targetNamespace'"
	 * @generated
	 */
	TeilbekanntesDatumType getGeburtsdatum();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.WeitereKinderAndererElternteilType#getGeburtsdatum <em>Geburtsdatum</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geburtsdatum</em>' containment reference.
	 * @see #getGeburtsdatum()
	 * @generated
	 */
	void setGeburtsdatum(TeilbekanntesDatumType value);

	/**
	 * Returns the value of the '<em><b>Wohnhaft Beim Anderen Elternteil</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Datum, ob das Kind beim "AndererEternteil" lebt.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Wohnhaft Beim Anderen Elternteil</em>' containment reference.
	 * @see #setWohnhaftBeimAnderenElternteil(CodeTatsachenbehauptungType)
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getWeitereKinderAndererElternteilType_WohnhaftBeimAnderenElternteil()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='wohnhaftBeimAnderenElternteil' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeTatsachenbehauptungType getWohnhaftBeimAnderenElternteil();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.WeitereKinderAndererElternteilType#getWohnhaftBeimAnderenElternteil <em>Wohnhaft Beim Anderen Elternteil</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wohnhaft Beim Anderen Elternteil</em>' containment reference.
	 * @see #getWohnhaftBeimAnderenElternteil()
	 * @generated
	 */
	void setWohnhaftBeimAnderenElternteil(CodeTatsachenbehauptungType value);

} // WeitereKinderAndererElternteilType
