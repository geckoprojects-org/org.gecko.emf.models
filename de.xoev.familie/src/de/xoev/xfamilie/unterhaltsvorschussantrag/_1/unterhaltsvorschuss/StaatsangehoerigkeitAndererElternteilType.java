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
 * A representation of the model object '<em><b>Staatsangehoerigkeit Anderer Elternteil Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Daten zur Staatsangehörigkeit des anderen Elternteils.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.StaatsangehoerigkeitAndererElternteilType#isBekannt <em>Bekannt</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.StaatsangehoerigkeitAndererElternteilType#getStaatsangehoerigkeit <em>Staatsangehoerigkeit</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getStaatsangehoerigkeitAndererElternteilType()
 * @model extendedMetaData="name='Staatsangehoerigkeit.andererElternteilType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface StaatsangehoerigkeitAndererElternteilType extends EObject {
	/**
	 * Returns the value of the '<em><b>Bekannt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Datum, ob die Staatangehörigkeit der antragstellenden Person bekannt ist.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bekannt</em>' attribute.
	 * @see #isSetBekannt()
	 * @see #unsetBekannt()
	 * @see #setBekannt(boolean)
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getStaatsangehoerigkeitAndererElternteilType_Bekannt()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='bekannt' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isBekannt();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.StaatsangehoerigkeitAndererElternteilType#isBekannt <em>Bekannt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bekannt</em>' attribute.
	 * @see #isSetBekannt()
	 * @see #unsetBekannt()
	 * @see #isBekannt()
	 * @generated
	 */
	void setBekannt(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.StaatsangehoerigkeitAndererElternteilType#isBekannt <em>Bekannt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBekannt()
	 * @see #isBekannt()
	 * @see #setBekannt(boolean)
	 * @generated
	 */
	void unsetBekannt();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.StaatsangehoerigkeitAndererElternteilType#isBekannt <em>Bekannt</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Bekannt</em>' attribute is set.
	 * @see #unsetBekannt()
	 * @see #isBekannt()
	 * @see #setBekannt(boolean)
	 * @generated
	 */
	boolean isSetBekannt();

	/**
	 * Returns the value of the '<em><b>Staatsangehoerigkeit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Datum zur Staatsangehörigkeit. Regel: Falls "bekannt" true ist.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Staatsangehoerigkeit</em>' containment reference.
	 * @see #setStaatsangehoerigkeit(StaatsangehoerigkeitType)
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getStaatsangehoerigkeitAndererElternteilType_Staatsangehoerigkeit()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='staatsangehoerigkeit' namespace='##targetNamespace'"
	 * @generated
	 */
	StaatsangehoerigkeitType getStaatsangehoerigkeit();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.StaatsangehoerigkeitAndererElternteilType#getStaatsangehoerigkeit <em>Staatsangehoerigkeit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Staatsangehoerigkeit</em>' containment reference.
	 * @see #getStaatsangehoerigkeit()
	 * @generated
	 */
	void setStaatsangehoerigkeit(StaatsangehoerigkeitType value);

} // StaatsangehoerigkeitAndererElternteilType
