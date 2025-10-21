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
 * A representation of the model object '<em><b>Anliegensklaerung Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Hier sind lediglich die Codes v, vu und u zu verwenden
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AnliegensklaerungType#getAnliegenVerhaeltnisJugendlich <em>Anliegen Verhaeltnis Jugendlich</em>}</li>
 *   <li>{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AnliegensklaerungType#isGemeinsamSorgeberechtigt <em>Gemeinsam Sorgeberechtigt</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.ErziehungshilfePackage#getAnliegensklaerungType()
 * @model extendedMetaData="name='AnliegensklaerungType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface AnliegensklaerungType extends EObject {
	/**
	 * Returns the value of the '<em><b>Anliegen Verhaeltnis Jugendlich</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Wenn es sich bei der antragstellenden Person um eine:n junge:n Volljährigen handelt, müssen hier keine Angaben zum Sorgerecht gemacht werden.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Anliegen Verhaeltnis Jugendlich</em>' containment reference.
	 * @see #setAnliegenVerhaeltnisJugendlich(CodeVerhaeltnisJugendlichHZEType)
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.ErziehungshilfePackage#getAnliegensklaerungType_AnliegenVerhaeltnisJugendlich()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='anliegenVerhaeltnisJugendlich' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeVerhaeltnisJugendlichHZEType getAnliegenVerhaeltnisJugendlich();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AnliegensklaerungType#getAnliegenVerhaeltnisJugendlich <em>Anliegen Verhaeltnis Jugendlich</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Anliegen Verhaeltnis Jugendlich</em>' containment reference.
	 * @see #getAnliegenVerhaeltnisJugendlich()
	 * @generated
	 */
	void setAnliegenVerhaeltnisJugendlich(CodeVerhaeltnisJugendlichHZEType value);

	/**
	 * Returns the value of the '<em><b>Gemeinsam Sorgeberechtigt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Üben Sie das Sorgerecht mit dem anderen Elternteil gemeinsam aus?
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Gemeinsam Sorgeberechtigt</em>' attribute.
	 * @see #isSetGemeinsamSorgeberechtigt()
	 * @see #unsetGemeinsamSorgeberechtigt()
	 * @see #setGemeinsamSorgeberechtigt(boolean)
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.ErziehungshilfePackage#getAnliegensklaerungType_GemeinsamSorgeberechtigt()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='gemeinsamSorgeberechtigt' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isGemeinsamSorgeberechtigt();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AnliegensklaerungType#isGemeinsamSorgeberechtigt <em>Gemeinsam Sorgeberechtigt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gemeinsam Sorgeberechtigt</em>' attribute.
	 * @see #isSetGemeinsamSorgeberechtigt()
	 * @see #unsetGemeinsamSorgeberechtigt()
	 * @see #isGemeinsamSorgeberechtigt()
	 * @generated
	 */
	void setGemeinsamSorgeberechtigt(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AnliegensklaerungType#isGemeinsamSorgeberechtigt <em>Gemeinsam Sorgeberechtigt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetGemeinsamSorgeberechtigt()
	 * @see #isGemeinsamSorgeberechtigt()
	 * @see #setGemeinsamSorgeberechtigt(boolean)
	 * @generated
	 */
	void unsetGemeinsamSorgeberechtigt();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AnliegensklaerungType#isGemeinsamSorgeberechtigt <em>Gemeinsam Sorgeberechtigt</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Gemeinsam Sorgeberechtigt</em>' attribute is set.
	 * @see #unsetGemeinsamSorgeberechtigt()
	 * @see #isGemeinsamSorgeberechtigt()
	 * @see #setGemeinsamSorgeberechtigt(boolean)
	 * @generated
	 */
	boolean isSetGemeinsamSorgeberechtigt();

} // AnliegensklaerungType
