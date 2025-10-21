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
 * A representation of the model object '<em><b>Staatsangehoerigkeit Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Daten zur Staatsangehörigkeit.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.StaatsangehoerigkeitType#getArt <em>Art</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.StaatsangehoerigkeitType#isVerlustRechtAufEinreise <em>Verlust Recht Auf Einreise</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getStaatsangehoerigkeitType()
 * @model extendedMetaData="name='StaatsangehoerigkeitType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface StaatsangehoerigkeitType extends EObject {
	/**
	 * Returns the value of the '<em><b>Art</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Datum, ob eine Person die Staatszugehoerigkeit zu Deutschland, der Schweiz, der EU oder dem Europäischen Wirtschaftsraum hat.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Art</em>' containment reference.
	 * @see #setArt(CodeStaatsangehoerigkeitUVType)
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getStaatsangehoerigkeitType_Art()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='art' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeStaatsangehoerigkeitUVType getArt();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.StaatsangehoerigkeitType#getArt <em>Art</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Art</em>' containment reference.
	 * @see #getArt()
	 * @generated
	 */
	void setArt(CodeStaatsangehoerigkeitUVType value);

	/**
	 * Returns the value of the '<em><b>Verlust Recht Auf Einreise</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Datum, ob eine Person durch eine Entscheidung der Auslaenderbehoerde des Recht auf Einreise und Aufenthalt nach §§ 2 Absatz 7, 5 Absatz 4, oder 6 Absatz 1 Freizuegigkeitsgesetz/EU verloren hat. Regel: Es muessen Daten uebertragen werden, falls "art" ein Land der EU, EWR oder Schweiz ist.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Verlust Recht Auf Einreise</em>' attribute.
	 * @see #isSetVerlustRechtAufEinreise()
	 * @see #unsetVerlustRechtAufEinreise()
	 * @see #setVerlustRechtAufEinreise(boolean)
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getStaatsangehoerigkeitType_VerlustRechtAufEinreise()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='verlustRechtAufEinreise' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isVerlustRechtAufEinreise();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.StaatsangehoerigkeitType#isVerlustRechtAufEinreise <em>Verlust Recht Auf Einreise</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Verlust Recht Auf Einreise</em>' attribute.
	 * @see #isSetVerlustRechtAufEinreise()
	 * @see #unsetVerlustRechtAufEinreise()
	 * @see #isVerlustRechtAufEinreise()
	 * @generated
	 */
	void setVerlustRechtAufEinreise(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.StaatsangehoerigkeitType#isVerlustRechtAufEinreise <em>Verlust Recht Auf Einreise</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVerlustRechtAufEinreise()
	 * @see #isVerlustRechtAufEinreise()
	 * @see #setVerlustRechtAufEinreise(boolean)
	 * @generated
	 */
	void unsetVerlustRechtAufEinreise();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.StaatsangehoerigkeitType#isVerlustRechtAufEinreise <em>Verlust Recht Auf Einreise</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Verlust Recht Auf Einreise</em>' attribute is set.
	 * @see #unsetVerlustRechtAufEinreise()
	 * @see #isVerlustRechtAufEinreise()
	 * @see #setVerlustRechtAufEinreise(boolean)
	 * @generated
	 */
	boolean isSetVerlustRechtAufEinreise();

} // StaatsangehoerigkeitType
