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
package de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Begruendung Des Hilfebedarfs Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.BegruendungDesHilfebedarfsType#getGrundBeantragung <em>Grund Beantragung</em>}</li>
 *   <li>{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.BegruendungDesHilfebedarfsType#getHilfeVomJugendamt <em>Hilfe Vom Jugendamt</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.ErziehungshilfePackage#getBegruendungDesHilfebedarfsType()
 * @model extendedMetaData="name='BegruendungDesHilfebedarfsType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface BegruendungDesHilfebedarfsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Grund Beantragung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bitte schildern Sie den Grund, warum Sie Hilfe oder Unterstützung benötigen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Grund Beantragung</em>' attribute.
	 * @see #setGrundBeantragung(String)
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.ErziehungshilfePackage#getBegruendungDesHilfebedarfsType_GrundBeantragung()
	 * @model dataType="de.xoev.kosit.datentyp._202204.din91379.DatatypeC"
	 *        extendedMetaData="kind='element' name='grundBeantragung' namespace='##targetNamespace'"
	 * @generated
	 */
	String getGrundBeantragung();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.BegruendungDesHilfebedarfsType#getGrundBeantragung <em>Grund Beantragung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grund Beantragung</em>' attribute.
	 * @see #getGrundBeantragung()
	 * @generated
	 */
	void setGrundBeantragung(String value);

	/**
	 * Returns the value of the '<em><b>Hilfe Vom Jugendamt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Welche Hilfe wünschen Sie sich vom Jugendamt?
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hilfe Vom Jugendamt</em>' attribute.
	 * @see #setHilfeVomJugendamt(String)
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.ErziehungshilfePackage#getBegruendungDesHilfebedarfsType_HilfeVomJugendamt()
	 * @model dataType="de.xoev.kosit.datentyp._202204.din91379.DatatypeC"
	 *        extendedMetaData="kind='element' name='hilfeVomJugendamt' namespace='##targetNamespace'"
	 * @generated
	 */
	String getHilfeVomJugendamt();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.BegruendungDesHilfebedarfsType#getHilfeVomJugendamt <em>Hilfe Vom Jugendamt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hilfe Vom Jugendamt</em>' attribute.
	 * @see #getHilfeVomJugendamt()
	 * @generated
	 */
	void setHilfeVomJugendamt(String value);

} // BegruendungDesHilfebedarfsType
