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
package de.xoev.domea.domea;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Anlage Dokument Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * AnlageDokument ist eine Erweiterung eines Dokuments zu einer Anlage mit einer entsprechenden Anlagennummer. Über sie werden andere Dokumente, die einem Dokument als Anlage zugeordnet werden, als solche gekennzeichnet.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.domea.domea.AnlageDokumentType#getNummer <em>Nummer</em>}</li>
 * </ul>
 *
 * @see de.xoev.domea.domea.DomeaPackage#getAnlageDokumentType()
 * @model extendedMetaData="name='AnlageDokumentType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface AnlageDokumentType extends DokumentOderDokumentMitSchriftstueckType {
	/**
	 * Returns the value of the '<em><b>Nummer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Die fortlaufende Nummer eines Anlagendokuments zu einem Dokument.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nummer</em>' attribute.
	 * @see #setNummer(String)
	 * @see de.xoev.domea.domea.DomeaPackage#getAnlageDokumentType_Nummer()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='Nummer' namespace='##targetNamespace'"
	 * @generated
	 */
	String getNummer();

	/**
	 * Sets the value of the '{@link de.xoev.domea.domea.AnlageDokumentType#getNummer <em>Nummer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nummer</em>' attribute.
	 * @see #getNummer()
	 * @generated
	 */
	void setNummer(String value);

} // AnlageDokumentType
