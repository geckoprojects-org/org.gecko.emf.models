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
package de.xoev.xfamilie.elterngeldantrag._1.elterngeld;

import de.xoev.xfamilie.baukasten._1.baukasten.AufenthaltstitelNachweisbezugType;
import de.xoev.xfamilie.baukasten._1.baukasten.StaatsangehoerigkeitenNachweisbezugType;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Staatsangehoerigkeit Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.StaatsangehoerigkeitType#getStaatsangehoerigkeiten <em>Staatsangehoerigkeiten</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.StaatsangehoerigkeitType#isVerlustFreizuegigkeit <em>Verlust Freizuegigkeit</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.StaatsangehoerigkeitType#getAufenthaltstitel <em>Aufenthaltstitel</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getStaatsangehoerigkeitType()
 * @model extendedMetaData="name='StaatsangehoerigkeitType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface StaatsangehoerigkeitType extends EObject {
	/**
	 * Returns the value of the '<em><b>Staatsangehoerigkeiten</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Die Staatsangehörigkeiten des antragstellenden Elternteils
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Staatsangehoerigkeiten</em>' containment reference.
	 * @see #setStaatsangehoerigkeiten(StaatsangehoerigkeitenNachweisbezugType)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getStaatsangehoerigkeitType_Staatsangehoerigkeiten()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='staatsangehoerigkeiten' namespace='##targetNamespace'"
	 * @generated
	 */
	StaatsangehoerigkeitenNachweisbezugType getStaatsangehoerigkeiten();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.StaatsangehoerigkeitType#getStaatsangehoerigkeiten <em>Staatsangehoerigkeiten</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Staatsangehoerigkeiten</em>' containment reference.
	 * @see #getStaatsangehoerigkeiten()
	 * @generated
	 */
	void setStaatsangehoerigkeiten(StaatsangehoerigkeitenNachweisbezugType value);

	/**
	 * Returns the value of the '<em><b>Verlust Freizuegigkeit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Verlust Freizuegigkeit</em>' attribute.
	 * @see #isSetVerlustFreizuegigkeit()
	 * @see #unsetVerlustFreizuegigkeit()
	 * @see #setVerlustFreizuegigkeit(boolean)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getStaatsangehoerigkeitType_VerlustFreizuegigkeit()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='verlustFreizuegigkeit' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isVerlustFreizuegigkeit();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.StaatsangehoerigkeitType#isVerlustFreizuegigkeit <em>Verlust Freizuegigkeit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Verlust Freizuegigkeit</em>' attribute.
	 * @see #isSetVerlustFreizuegigkeit()
	 * @see #unsetVerlustFreizuegigkeit()
	 * @see #isVerlustFreizuegigkeit()
	 * @generated
	 */
	void setVerlustFreizuegigkeit(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.StaatsangehoerigkeitType#isVerlustFreizuegigkeit <em>Verlust Freizuegigkeit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVerlustFreizuegigkeit()
	 * @see #isVerlustFreizuegigkeit()
	 * @see #setVerlustFreizuegigkeit(boolean)
	 * @generated
	 */
	void unsetVerlustFreizuegigkeit();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.StaatsangehoerigkeitType#isVerlustFreizuegigkeit <em>Verlust Freizuegigkeit</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Verlust Freizuegigkeit</em>' attribute is set.
	 * @see #unsetVerlustFreizuegigkeit()
	 * @see #isVerlustFreizuegigkeit()
	 * @see #setVerlustFreizuegigkeit(boolean)
	 * @generated
	 */
	boolean isSetVerlustFreizuegigkeit();

	/**
	 * Returns the value of the '<em><b>Aufenthaltstitel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angaben zum Aufenthaltstitel.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Aufenthaltstitel</em>' containment reference.
	 * @see #setAufenthaltstitel(AufenthaltstitelNachweisbezugType)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getStaatsangehoerigkeitType_Aufenthaltstitel()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='aufenthaltstitel' namespace='##targetNamespace'"
	 * @generated
	 */
	AufenthaltstitelNachweisbezugType getAufenthaltstitel();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.StaatsangehoerigkeitType#getAufenthaltstitel <em>Aufenthaltstitel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aufenthaltstitel</em>' containment reference.
	 * @see #getAufenthaltstitel()
	 * @generated
	 */
	void setAufenthaltstitel(AufenthaltstitelNachweisbezugType value);

} // StaatsangehoerigkeitType
