package calendar_sync.domain

import scala.util.Try

trait CredentialRepository {
  def get: Try[Credential]
  def update(credential: Credential): Try[Unit]
}