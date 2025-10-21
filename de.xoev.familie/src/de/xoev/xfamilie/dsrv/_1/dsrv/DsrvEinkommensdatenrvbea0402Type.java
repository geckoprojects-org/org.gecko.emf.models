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
package de.xoev.xfamilie.dsrv._1.dsrv;

import de.xoev.xfamilie.baukasten._1.baukasten.NachrichtType;

import java.math.BigInteger;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dsrv Einkommensdatenrvbea0402 Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.dsrv._1.dsrv.DsrvEinkommensdatenrvbea0402Type#getDxeb <em>Dxeb</em>}</li>
 *   <li>{@link de.xoev.xfamilie.dsrv._1.dsrv.DsrvEinkommensdatenrvbea0402Type#getIfdNrArbeitgeber <em>Ifd Nr Arbeitgeber</em>}</li>
 *   <li>{@link de.xoev.xfamilie.dsrv._1.dsrv.DsrvEinkommensdatenrvbea0402Type#getAbfrageID <em>Abfrage ID</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.dsrv._1.dsrv.DSRVPackage#getDsrvEinkommensdatenrvbea0402Type()
 * @model extendedMetaData="name='dsrv.einkommensdatenrvbea.0402_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface DsrvEinkommensdatenrvbea0402Type extends NachrichtType {
	/**
	 * Returns the value of the '<em><b>Dxeb</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Antwort auf eine rvBEA-Anforderung.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dxeb</em>' containment reference.
	 * @see #setDxeb(AnyTypeFamilieDSRVType)
	 * @see de.xoev.xfamilie.dsrv._1.dsrv.DSRVPackage#getDsrvEinkommensdatenrvbea0402Type_Dxeb()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dxeb' namespace='##targetNamespace'"
	 * @generated
	 */
	AnyTypeFamilieDSRVType getDxeb();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.dsrv._1.dsrv.DsrvEinkommensdatenrvbea0402Type#getDxeb <em>Dxeb</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dxeb</em>' containment reference.
	 * @see #getDxeb()
	 * @generated
	 */
	void setDxeb(AnyTypeFamilieDSRVType value);

	/**
	 * Returns the value of the '<em><b>Ifd Nr Arbeitgeber</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Im Kontext der Abfrage (abfrageID) verwendete eindeutige ID des Arbeitgebers.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ifd Nr Arbeitgeber</em>' attribute.
	 * @see #setIfdNrArbeitgeber(BigInteger)
	 * @see de.xoev.xfamilie.dsrv._1.dsrv.DSRVPackage#getDsrvEinkommensdatenrvbea0402Type_IfdNrArbeitgeber()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 *        extendedMetaData="kind='element' name='ifdNrArbeitgeber' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getIfdNrArbeitgeber();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.dsrv._1.dsrv.DsrvEinkommensdatenrvbea0402Type#getIfdNrArbeitgeber <em>Ifd Nr Arbeitgeber</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifd Nr Arbeitgeber</em>' attribute.
	 * @see #getIfdNrArbeitgeber()
	 * @generated
	 */
	void setIfdNrArbeitgeber(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Abfrage ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Eindeutige ID, mit der sämtliche Antworten zu dieser Abfrage versehen werden.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Abfrage ID</em>' attribute.
	 * @see #setAbfrageID(String)
	 * @see de.xoev.xfamilie.dsrv._1.dsrv.DSRVPackage#getDsrvEinkommensdatenrvbea0402Type_AbfrageID()
	 * @model dataType="de.xoev.xfamilie.baukasten._1.baukasten.UUIDType" required="true"
	 *        extendedMetaData="kind='element' name='abfrageID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getAbfrageID();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.dsrv._1.dsrv.DsrvEinkommensdatenrvbea0402Type#getAbfrageID <em>Abfrage ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abfrage ID</em>' attribute.
	 * @see #getAbfrageID()
	 * @generated
	 */
	void setAbfrageID(String value);

} // DsrvEinkommensdatenrvbea0402Type
