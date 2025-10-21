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
package de.xoev.xfamilie.kinderwunsch._1.kinderwunsch;

import de.xoev.xfamilie.baukasten._1.baukasten.NachweisdokumentType;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Nachreichung Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.NachreichungType#getArtNachreichung <em>Art Nachreichung</em>}</li>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.NachreichungType#getNachweis <em>Nachweis</em>}</li>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.NachreichungType#isEinwilligungDatenverarbeitungDurchFoerderstelle <em>Einwilligung Datenverarbeitung Durch Foerderstelle</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschPackage#getNachreichungType()
 * @model extendedMetaData="name='NachreichungType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface NachreichungType extends EObject {
	/**
	 * Returns the value of the '<em><b>Art Nachreichung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Art Nachreichung</em>' containment reference.
	 * @see #setArtNachreichung(ArtNachreichungType)
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschPackage#getNachreichungType_ArtNachreichung()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='artNachreichung' namespace='##targetNamespace'"
	 * @generated
	 */
	ArtNachreichungType getArtNachreichung();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.NachreichungType#getArtNachreichung <em>Art Nachreichung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Art Nachreichung</em>' containment reference.
	 * @see #getArtNachreichung()
	 * @generated
	 */
	void setArtNachreichung(ArtNachreichungType value);

	/**
	 * Returns the value of the '<em><b>Nachweis</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nachweis</em>' containment reference.
	 * @see #setNachweis(NachweisdokumentType)
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschPackage#getNachreichungType_Nachweis()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='nachweis' namespace='##targetNamespace'"
	 * @generated
	 */
	NachweisdokumentType getNachweis();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.NachreichungType#getNachweis <em>Nachweis</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nachweis</em>' containment reference.
	 * @see #getNachweis()
	 * @generated
	 */
	void setNachweis(NachweisdokumentType value);

	/**
	 * Returns the value of the '<em><b>Einwilligung Datenverarbeitung Durch Foerderstelle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Einwilligung Datenverarbeitung Durch Foerderstelle</em>' attribute.
	 * @see #isSetEinwilligungDatenverarbeitungDurchFoerderstelle()
	 * @see #unsetEinwilligungDatenverarbeitungDurchFoerderstelle()
	 * @see #setEinwilligungDatenverarbeitungDurchFoerderstelle(boolean)
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschPackage#getNachreichungType_EinwilligungDatenverarbeitungDurchFoerderstelle()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='einwilligungDatenverarbeitungDurchFoerderstelle' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isEinwilligungDatenverarbeitungDurchFoerderstelle();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.NachreichungType#isEinwilligungDatenverarbeitungDurchFoerderstelle <em>Einwilligung Datenverarbeitung Durch Foerderstelle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Einwilligung Datenverarbeitung Durch Foerderstelle</em>' attribute.
	 * @see #isSetEinwilligungDatenverarbeitungDurchFoerderstelle()
	 * @see #unsetEinwilligungDatenverarbeitungDurchFoerderstelle()
	 * @see #isEinwilligungDatenverarbeitungDurchFoerderstelle()
	 * @generated
	 */
	void setEinwilligungDatenverarbeitungDurchFoerderstelle(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.NachreichungType#isEinwilligungDatenverarbeitungDurchFoerderstelle <em>Einwilligung Datenverarbeitung Durch Foerderstelle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEinwilligungDatenverarbeitungDurchFoerderstelle()
	 * @see #isEinwilligungDatenverarbeitungDurchFoerderstelle()
	 * @see #setEinwilligungDatenverarbeitungDurchFoerderstelle(boolean)
	 * @generated
	 */
	void unsetEinwilligungDatenverarbeitungDurchFoerderstelle();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.NachreichungType#isEinwilligungDatenverarbeitungDurchFoerderstelle <em>Einwilligung Datenverarbeitung Durch Foerderstelle</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Einwilligung Datenverarbeitung Durch Foerderstelle</em>' attribute is set.
	 * @see #unsetEinwilligungDatenverarbeitungDurchFoerderstelle()
	 * @see #isEinwilligungDatenverarbeitungDurchFoerderstelle()
	 * @see #setEinwilligungDatenverarbeitungDurchFoerderstelle(boolean)
	 * @generated
	 */
	boolean isSetEinwilligungDatenverarbeitungDurchFoerderstelle();

} // NachreichungType
