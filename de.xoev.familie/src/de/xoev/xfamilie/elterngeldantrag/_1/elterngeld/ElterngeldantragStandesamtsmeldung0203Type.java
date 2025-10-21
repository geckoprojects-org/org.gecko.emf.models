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

import de.xoev.xfamilie.baukasten._1.baukasten.AntragsnachrichtType;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Elterngeldantrag Standesamtsmeldung0203 Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldantragStandesamtsmeldung0203Type#isAnforderungErfolgt <em>Anforderung Erfolgt</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getElterngeldantragStandesamtsmeldung0203Type()
 * @model extendedMetaData="name='elterngeldantrag.standesamtsmeldung.0203_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ElterngeldantragStandesamtsmeldung0203Type extends AntragsnachrichtType {
	/**
	 * Returns the value of the '<em><b>Anforderung Erfolgt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * true, falls das Standesamt die Anforderung einer Geburtsurkunde erhalten hat, sonst false
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Anforderung Erfolgt</em>' attribute.
	 * @see #isSetAnforderungErfolgt()
	 * @see #unsetAnforderungErfolgt()
	 * @see #setAnforderungErfolgt(boolean)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getElterngeldantragStandesamtsmeldung0203Type_AnforderungErfolgt()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='anforderungErfolgt' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isAnforderungErfolgt();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldantragStandesamtsmeldung0203Type#isAnforderungErfolgt <em>Anforderung Erfolgt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Anforderung Erfolgt</em>' attribute.
	 * @see #isSetAnforderungErfolgt()
	 * @see #unsetAnforderungErfolgt()
	 * @see #isAnforderungErfolgt()
	 * @generated
	 */
	void setAnforderungErfolgt(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldantragStandesamtsmeldung0203Type#isAnforderungErfolgt <em>Anforderung Erfolgt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAnforderungErfolgt()
	 * @see #isAnforderungErfolgt()
	 * @see #setAnforderungErfolgt(boolean)
	 * @generated
	 */
	void unsetAnforderungErfolgt();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldantragStandesamtsmeldung0203Type#isAnforderungErfolgt <em>Anforderung Erfolgt</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Anforderung Erfolgt</em>' attribute is set.
	 * @see #unsetAnforderungErfolgt()
	 * @see #isAnforderungErfolgt()
	 * @see #setAnforderungErfolgt(boolean)
	 * @generated
	 */
	boolean isSetAnforderungErfolgt();

} // ElterngeldantragStandesamtsmeldung0203Type
