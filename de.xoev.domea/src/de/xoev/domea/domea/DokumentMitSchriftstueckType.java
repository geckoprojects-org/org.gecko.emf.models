/*
 */
package de.xoev.domea.domea;

import org.eclipse.emf.common.util.EList;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dokument Mit Schriftstueck Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Angaben zu einem Dokument mit darunterliegenden Schriftstücken.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.domea.domea.DokumentMitSchriftstueckType#getSchriftstueck <em>Schriftstueck</em>}</li>
 * </ul>
 *
 * @see de.xoev.domea.domea.DomeaPackage#getDokumentMitSchriftstueckType()
 * @model extendedMetaData="name='DokumentMitSchriftstueckType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface DokumentMitSchriftstueckType extends DokumentSchriftstueckBasisType {
	/**
	 * Returns the value of the '<em><b>Schriftstueck</b></em>' containment reference list.
	 * The list contents are of type {@link de.xoev.domea.domea.DokumentType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ein Schriftstück ist ein Bestandteil des Dokuments in Form eines Einzelobjektes, bei dem das Dokument als übergeordneter (Metadaten-)Container fungiert.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Schriftstueck</em>' containment reference list.
	 * @see de.xoev.domea.domea.DomeaPackage#getDokumentMitSchriftstueckType_Schriftstueck()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Schriftstueck' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DokumentType> getSchriftstueck();

} // DokumentMitSchriftstueckType
