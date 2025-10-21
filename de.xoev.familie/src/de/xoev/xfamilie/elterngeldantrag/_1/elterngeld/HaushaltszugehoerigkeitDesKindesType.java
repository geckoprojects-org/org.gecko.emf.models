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

import de.xoev.xfamilie.baukasten._1.baukasten.TatsacheMitZeitraumType;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Haushaltszugehoerigkeit Des Kindes Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Angabe, ob das Kind mit dem antragstellenden Elternteil in einem Haushalt lebt und von dem Elternteil betreut und erzogen wird.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.HaushaltszugehoerigkeitDesKindesType#getBetreuungUndErziehungImEigenenHaushalt <em>Betreuung Und Erziehung Im Eigenen Haushalt</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getHaushaltszugehoerigkeitDesKindesType()
 * @model extendedMetaData="name='HaushaltszugehoerigkeitDesKindesType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface HaushaltszugehoerigkeitDesKindesType extends EObject {
	/**
	 * Returns the value of the '<em><b>Betreuung Und Erziehung Im Eigenen Haushalt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angabe, ob das Kind mit dem antragstellenden Elternteil in einem Haushalt lebt und von dem Elternteil betreut und erzogen wird.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Betreuung Und Erziehung Im Eigenen Haushalt</em>' containment reference.
	 * @see #setBetreuungUndErziehungImEigenenHaushalt(TatsacheMitZeitraumType)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getHaushaltszugehoerigkeitDesKindesType_BetreuungUndErziehungImEigenenHaushalt()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='betreuungUndErziehungImEigenenHaushalt' namespace='##targetNamespace'"
	 * @generated
	 */
	TatsacheMitZeitraumType getBetreuungUndErziehungImEigenenHaushalt();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.HaushaltszugehoerigkeitDesKindesType#getBetreuungUndErziehungImEigenenHaushalt <em>Betreuung Und Erziehung Im Eigenen Haushalt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Betreuung Und Erziehung Im Eigenen Haushalt</em>' containment reference.
	 * @see #getBetreuungUndErziehungImEigenenHaushalt()
	 * @generated
	 */
	void setBetreuungUndErziehungImEigenenHaushalt(TatsacheMitZeitraumType value);

} // HaushaltszugehoerigkeitDesKindesType
